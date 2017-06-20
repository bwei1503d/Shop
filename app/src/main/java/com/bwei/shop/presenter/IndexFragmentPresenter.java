package com.bwei.shop.presenter;

import com.bwei.shop.base.BasePresenter;
import com.bwei.shop.bean.IndexBean;
import com.bwei.shop.model.IndexFragmentModel;
import com.bwei.shop.model.IndexFragmentModelImpl;
import com.bwei.shop.view.IndexFragmentView;

/**
 * Created by muhanxi on 17/6/20.
 */

public class IndexFragmentPresenter extends BasePresenter<IndexFragmentView> {


    private IndexFragmentModelImpl indexFragmentModel ;

    public IndexFragmentPresenter(){
        indexFragmentModel = new IndexFragmentModelImpl();
    }




    //获取数据
    public void getData(int pos){

        indexFragmentModel.getData(pos, new IndexFragmentModel.IndexFragmentModelListener() {
            @Override
            public void onSuccess(IndexBean indexBean) {

                view.onSuccess(indexBean);
            }

            @Override
            public void onFailed(int code) {

                view.onFailed(code);
            }
        });


    }


}
