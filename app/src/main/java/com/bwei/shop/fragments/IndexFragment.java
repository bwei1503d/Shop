package com.bwei.shop.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bwei.shop.R;
import com.bwei.shop.adapters.IndexFragmentRecycleViewAdapter;
import com.bwei.shop.base.BaseMvpFragment;
import com.bwei.shop.bean.IndexBean;
import com.bwei.shop.presenter.IndexFragmentPresenter;
import com.bwei.shop.view.IndexFragmentView;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link IndexFragment#newInstance} factory method to
 * create an instance of this fragment.
 */


public class IndexFragment extends BaseMvpFragment<IndexFragmentView,IndexFragmentPresenter> implements IndexFragmentView {
    private static final String ARG_PARAM1 = "param1";

    // TODO: Rename and change types of parameters
    private int mParam1;
    private RecyclerView recyclerView;

    private List<IndexBean.DataBean> list = new ArrayList<IndexBean.DataBean>();
    private IndexFragmentRecycleViewAdapter adapter;

    @Override
    public IndexFragmentPresenter initPresenter() {
        return new IndexFragmentPresenter();
    }

    public IndexFragment() {
    }


    public static IndexFragment newInstance(int param1) {
        IndexFragment fragment = new IndexFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_PARAM1, param1);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getInt(ARG_PARAM1);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_index, container, false);

        initView(view);
        return  view;
    }


    public void initView(View view){

        recyclerView = (RecyclerView) view.findViewById(R.id.recycleview_id);
        adapter = new IndexFragmentRecycleViewAdapter(getActivity(),list);

        LinearLayoutManager manager = new LinearLayoutManager(getActivity(),LinearLayoutManager.VERTICAL,false);


        recyclerView.setLayoutManager(manager);
        recyclerView.setAdapter(adapter);


        presenter.getData(mParam1);

    }




    @Override
    public void onSuccess(IndexBean indexBean) {
        list.addAll(indexBean.getData());

        adapter.notifyDataSetChanged();

    }

    @Override
    public void onFailed(int code) {

    }
}
