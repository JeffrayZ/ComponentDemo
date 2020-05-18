package com.example.baselib;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public abstract class BaseActivity extends AppCompatActivity {
    protected final String TAG = "组件化>>>>"+this.getClass().getName();
}
