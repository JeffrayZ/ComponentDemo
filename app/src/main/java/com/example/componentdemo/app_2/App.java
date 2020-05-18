package com.example.componentdemo.app_2;

import com.example.baselib.app_2.BaseApplication;
import com.example.logincomponent.app_2.LoginLogic;
import com.example.mainappcomponent.BuildConfig;
import com.example.mainappcomponent.app_2.MainAppLogic;
import com.example.shoppingcenter.app_2.ShoppingCenterLogic;

/**
 * @ProjectName: ComponentDemo
 * @Package: com.example.componentdemo.app_2
 * @ClassName: App
 * @Description: java类作用描述
 * @Author: Jeffray
 * @CreateDate: 2020/4/26 11:30
 * @UpdateUser: 更新者
 * @UpdateDate: 2020/4/26 11:30
 * @UpdateRemark: 更新说明
 * @Version: 1.0
 */
public class App extends BaseApplication {
    @Override
    protected void initLogic() {
        registerApplicationLogic(MainAppLogic.class);
        registerApplicationLogic(LoginLogic.class);
        registerApplicationLogic(ShoppingCenterLogic.class);
    }
}
