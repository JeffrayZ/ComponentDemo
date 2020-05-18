package com.example.baselib.app_2;

import android.app.Application;
import android.content.res.Configuration;

import androidx.annotation.NonNull;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.baselib.BuildConfig;

import java.util.ArrayList;
import java.util.List;

/**
 * @ProjectName: ComponentDemo
 * @Package: com.example.baselib
 * @ClassName: BaseApplication
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/4/24 15:43
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/4/24 15:43
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public abstract class BaseApplication extends Application {
    protected final String TAG = "组件化>>>>" + this.getClass().getName();
    private List<Class<? extends BaseAppLogic>> logicList = new ArrayList<>();
    private List<BaseAppLogic> logicClassList = new ArrayList<>();

    @Override
    public void onCreate() {
        super.onCreate();
        // 这两行必须写在init之前，否则这些配置在init过程中将无效
        if (isDebug()) {
            ARouter.openLog();     // 打印日志
            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
        }
        // 尽可能早，推荐在Application中初始化
        ARouter.init(this);

        initLogic();
        logicCreat();
    }

    // 壳app的application中调用
    protected abstract void initLogic();

    protected void registerApplicationLogic(Class<? extends BaseAppLogic> logicClass) {
        logicList.add(logicClass);
    }

    private void logicCreat() {
        for (Class<? extends BaseAppLogic> logicClass :
                logicList) {
            try {
                BaseAppLogic appLogic = logicClass.newInstance();
                logicClassList.add(appLogic);
                appLogic.onCreate();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InstantiationException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
        for (BaseAppLogic appLogic :
                logicClassList) {
            appLogic.onTerminate();
        }
    }

    @Override
    public void onConfigurationChanged(@NonNull Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        for (BaseAppLogic appLogic :
                logicClassList) {
            appLogic.onConfigurationChanged(newConfig);
        }
    }

    @Override
    public void onLowMemory() {
        super.onLowMemory();
        for (BaseAppLogic appLogic :
                logicClassList) {
            appLogic.onLowMemory();
        }
    }

    @Override
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        for (BaseAppLogic appLogic :
                logicClassList) {
            appLogic.onTrimMemory(level);
        }
    }

    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}
