package com.example.baselib;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.util.Log;

import com.example.baselib.app_1.BaseAppInit;

import java.util.ArrayList;
import java.util.List;

public class ManifestParser {
    private static final String MODULE_VALUE = "BaseAppInit";
    public static List<BaseAppInit> parseMenifest(Context context) {
        List<BaseAppInit> appInits = new ArrayList<>();
        try {
            ApplicationInfo appInfo = context.getPackageManager().getApplicationInfo(
                    context.getPackageName(), PackageManager.GET_META_DATA);
            if (appInfo.metaData != null) {
                for (String key :
                        appInfo.metaData.keySet()) {
                    Log.d("ManifestParser",key);
                    Log.d("ManifestParser",appInfo.metaData.get(key).toString());
                    if (MODULE_VALUE.equals(appInfo.metaData.get(key).toString())) {
                        appInits.add(parseModule(key));
                    }
                }
            }
        } catch (PackageManager.NameNotFoundException e) {
            throw new RuntimeException("解析Application失败", e);
        }
        Log.d("ManifestParser",appInits.toString());
        return appInits;
    }

    private static BaseAppInit parseModule(String key) {
        BaseAppInit appInit = null;
        try {
            Class clazz = Class.forName(key);
            appInit = (BaseAppInit) clazz.newInstance();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return appInit;
    }
}