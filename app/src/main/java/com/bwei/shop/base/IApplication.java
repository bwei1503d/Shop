package com.bwei.shop.base;

import android.app.Application;

import com.squareup.leakcanary.LeakCanary;

/**
 * Created by muhanxi on 17/6/19.
 */

public class IApplication extends Application {


    public static IApplication application ;

    @Override
    public void onCreate() {
        super.onCreate();
        application = this;



        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        LeakCanary.install(this);

    }
}
