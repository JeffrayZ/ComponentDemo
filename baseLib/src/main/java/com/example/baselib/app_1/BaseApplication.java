package com.example.baselib.app_1;

import android.app.Application;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.baselib.BuildConfig;

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
public class BaseApplication extends Application {
    protected final String TAG = "组件化>>>>" + this.getClass().getName();

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
    }

    private boolean isDebug() {
        return BuildConfig.DEBUG;
    }
}
