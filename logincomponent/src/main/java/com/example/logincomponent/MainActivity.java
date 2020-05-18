package com.example.logincomponent;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.baselib.BaseActivity;
import com.example.baselib.RouterPage;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG,"登录组件的MainActivity启动");
        setContentView(R.layout.activity_main);
    }

    public void enterLoginUI(View view) {
        ARouter.getInstance().build(RouterPage.LOGIN_PAGE).navigation();
    }
}
