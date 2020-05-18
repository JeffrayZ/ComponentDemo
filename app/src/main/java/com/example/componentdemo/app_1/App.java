package com.example.componentdemo.app_1;

import android.content.Context;
import android.util.Log;

import com.example.baselib.ManifestParser;
import com.example.baselib.app_1.BaseAppInit;
import com.example.baselib.app_1.BaseApplication;

import java.util.List;

/**
 * @ProjectName: ComponentDemo
 * @Package: com.example.componentdemo.app_1
 * @ClassName: App
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/4/25 19:36
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/4/25 19:36
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class App extends BaseApplication {
    private List<BaseAppInit> appInits;
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d(TAG,"壳App 初始化");
        initApp();
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        Log.d(TAG,"壳App attachBaseContext");
        appInits = ManifestParser.parseMenifest(base);
    }

    private void initApp(){
        for (BaseAppInit app:
                appInits) {
            app.onInitSpeed();
        }
        for (BaseAppInit app:
                appInits) {
            app.onInitLow();
        }
    }
}
