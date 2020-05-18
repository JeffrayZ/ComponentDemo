package com.example.mainappcomponent.app_2;

import android.util.Log;

import com.example.baselib.app_2.BaseAppLogic;

/**
 * @ProjectName: ComponentDemo
 * @Package: com.example.mainappcomponent.app_2
 * @ClassName: MainAppLogic
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/4/26 11:27
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/4/26 11:27
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class MainAppLogic extends BaseAppLogic {
    @Override
    public void onCreate() {
        super.onCreate();
        Log.d("MainAppLogic","MainAppLogic 初始化");
    }
}
