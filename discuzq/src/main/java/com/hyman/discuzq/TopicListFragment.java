package com.hyman.discuzq;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.arch.demo.core.fragment.MvvmFragment;
import com.arch.demo.core.viewmodel.IMvvmBaseViewModel;
import com.hyman.discuzq.bean.TopicBean;
import com.hyman.discuzq.databinding.FragmentTopicBinding;
import com.scwang.smartrefresh.header.WaterDropHeader;
import com.scwang.smartrefresh.layout.constant.SpinnerStyle;
import com.scwang.smartrefresh.layout.footer.BallPulseFooter;

public class TopicListFragment extends MvvmFragment<FragmentTopicBinding,TopicListViewModel> implements TopicListViewModel.IView{

    private String id;
    private String name;
    private TopicItemRVAdapter mAdapter;

    public static Fragment newInstance(String id, String name) {
        Bundle args = new Bundle();
        TopicListFragment fragment = new TopicListFragment();
        args.putString("id",id);
        args.putString("name",name);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    protected void initParameters() {
        id = getArguments().getString("id");
        name = getArguments().getString("name");
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        viewDataBinding.listview.setHasFixedSize(true);
        viewDataBinding.listview.setLayoutManager(new LinearLayoutManager(getContext()));
        mAdapter = new TopicItemRVAdapter();
        viewDataBinding.listview.setAdapter(mAdapter);
        viewDataBinding.refreshLayout.setRefreshHeader(new WaterDropHeader(getContext()));
        viewDataBinding.refreshLayout.setRefreshFooter(new BallPulseFooter(getContext()).setSpinnerStyle(SpinnerStyle.Scale));
        viewDataBinding.refreshLayout.setOnRefreshListener(refreshlayout -> {
//            viewModel.tryToRefresh();
        });
        viewDataBinding.refreshLayout.setOnLoadMoreListener(refreshlayout -> {
//            viewModel.tryToLoadNextPage();
        });
        setLoadSir(viewDataBinding.refreshLayout);
        showLoading();
    }

    @Override
    public int getBindingVariable() {
        return 0;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_topic;
    }

    @Override
    public TopicListViewModel getViewModel() {
        return new TopicListViewModel(id,name);
    }

    @Override
    protected void onRetryBtnClick() {

    }

    @Override
    protected String getFragmentTag() {
        return null;
    }

    /**
     * 数据回调
     * @param data
     */
    @Override
    public void onTopicLoaded(TopicBean data) {

    }
}
