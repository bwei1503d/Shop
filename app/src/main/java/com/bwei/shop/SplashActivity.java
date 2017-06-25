package com.bwei.shop;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.bwei.shop.activitys.PermissionActivity;
import com.bwei.shop.activitys.PermissionActivity1;
import com.bwei.shop.activitys.TabActivity;
import com.bwei.shop.base.BaseMvpActivity;
import com.bwei.shop.base.BasePresenter;
import com.bwei.shop.presenter.SplashPresenter;
import com.bwei.shop.utils.DeviceUtils;
import com.bwei.shop.view.SplashView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.T;


/**
 * 启动页面
 *
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


        final TextView textView = (TextView) findViewById(R.id.textview_id);
//
//        textView.setLayoutParams(new LinearLayout.LayoutParams(DeviceUtils.px2dip(this,100),100));
//
        Toast.makeText(this, "" + textView.getLayoutParams().width, Toast.LENGTH_SHORT).show();

//        presenter.getData();
        startActivity(new Intent(this, TabActivity.class));




    }

}
