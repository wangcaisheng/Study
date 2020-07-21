package com.hyman.discuzq;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import com.arch.demo.core.fragment.MvvmFragment;
import com.arch.demo.core.viewmodel.IMvvmBaseViewModel;
import com.hyman.discuzq.databinding.FragmentTopicBinding;

public class TopicListFragment extends MvvmFragment<FragmentTopicBinding,TopicListViewModel> {

    public static Fragment newInstance(String id, String name) {
        Bundle args = new Bundle();
        TopicListFragment fragment = new TopicListFragment();
        fragment.setArguments(args);
        return fragment;
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
        return new TopicListViewModel();
    }

    @Override
    protected void onRetryBtnClick() {

    }

    @Override
    protected String getFragmentTag() {
        return null;
    }
}
