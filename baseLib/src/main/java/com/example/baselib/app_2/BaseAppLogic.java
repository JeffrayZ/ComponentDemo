package com.example.baselib.app_2;

import android.content.res.Configuration;

import androidx.annotation.NonNull;

/**
 * @ProjectName: ComponentDemo
 * @Package: com.example.baselib.app_2
 * @ClassName: BaseAppLogic
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/4/26 11:11
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/4/26 11:11
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class BaseAppLogic {
    protected BaseApplication application;

    public BaseAppLogic() {
    }

    public void setApplication(@NonNull BaseApplication application) {
        this.application = application;
    }

    public void onCreate() {

    }

    public void onConfigurationChanged(@NonNull Configuration newConfig) {
    }

    public void onLowMemory() {

    }

    public void onTrimMemory(int level) {

    }

    public void onTerminate() {
    }
}
