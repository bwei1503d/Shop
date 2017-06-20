package com.bwei.shop.view;

import com.bwei.shop.bean.IndexBean;

/**
 * Created by muhanxi on 17/6/20.
 */

public interface IndexFragmentView {



    public void onSuccess(IndexBean indexBean);

    public void onFailed(int code);

}
