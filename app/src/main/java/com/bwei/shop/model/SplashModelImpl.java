package com.bwei.shop.model;

import android.widget.Toast;

import com.bwei.shop.network.ApiService;
import com.bwei.shop.network.BaseObserver;
import com.bwei.shop.network.RetrofitFactory;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.annotations.NonNull;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by muhanxi on 17/6/19.
 */

public class SplashModelImpl {







    public void getData(){




        RetrofitFactory.get("http://qhb.2dyt.com/Bwei/login?username=11111111111&password=1&postkey=1503d").subscribe(new BaseObserver() {
            @Override
            public void onSuccess(String result) {


                System.out.println("result = " + result);

            }

            @Override
            public void onFailed() {


            }
        });


    }


}
