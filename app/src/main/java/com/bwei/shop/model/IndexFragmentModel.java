package com.bwei.shop.model;

import com.bwei.shop.bean.IndexBean;

/**
 * Created by muhanxi on 17/6/20.
 */

public interface IndexFragmentModel {


    //
    public void getData(int pos,IndexFragmentModelListener listener);









    //


    public interface IndexFragmentModelListener {


        public void onSuccess(IndexBean indexBean);
        public void onFailed(int code);

    }


}
