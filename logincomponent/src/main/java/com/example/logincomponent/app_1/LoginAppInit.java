package com.example.logincomponent.app_1;

import android.util.Log;

import com.example.baselib.app_1.BaseAppInit;

/**
 * @ProjectName: ComponentDemo
 * @Package: com.example.logincomponent.app_1
 * @ClassName: LoginAppInit
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/4/25 18:45
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/4/25 18:45
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class LoginAppInit implements BaseAppInit {
    @Override
    public boolean onInitSpeed() {
        Log.d("AppInit","LoginAppInit onInitSpeed");
        return false;
    }

    @Override
    public boolean onInitLow() {
        Log.d("AppInit","LoginAppInit onInitLow");
        return false;
    }
}
