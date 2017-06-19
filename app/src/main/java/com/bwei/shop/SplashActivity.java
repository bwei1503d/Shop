package com.bwei.shop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import com.bwei.shop.activitys.TabActivity;
import com.bwei.shop.base.BaseMvpActivity;
import com.bwei.shop.base.BasePresenter;
import com.bwei.shop.presenter.SplashPresenter;
import com.bwei.shop.view.SplashView;


/**
 * 启动页面
 */

public class SplashActivity extends BaseMvpActivity<SplashView,SplashPresenter> {


    @Override
    public SplashPresenter initPresenter() {
        return new SplashPresenter();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        startActivity(new Intent(this, TabActivity.class));

//        presenter.getData();



    }
}
