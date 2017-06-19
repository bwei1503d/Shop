package com.bwei.shop.presenter;

import com.bwei.shop.base.BasePresenter;
import com.bwei.shop.model.SplashModelImpl;
import com.bwei.shop.view.SplashView;

/**
 * Created by muhanxi on 17/6/19.
 */

public class SplashPresenter extends BasePresenter<SplashView> {


    private SplashModelImpl splashModel ;


    public SplashPresenter(){

        splashModel = new SplashModelImpl();



    }



    public void getData(){

        splashModel.getData();
    }


}
