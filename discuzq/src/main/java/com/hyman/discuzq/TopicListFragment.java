package com.hyman.discuzq;

import android.os.Bundle;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.arch.demo.core.fragment.MvvmFragment;
import com.arch.demo.core.viewmodel.IMvvmBaseViewModel;
import com.hyman.discuzq.databinding.FragmentTopicBinding;

public class TopicListFragment extends MvvmFragment<FragmentTopicBinding, TopicListViewModel> {

    private String id;
    private String name;

    public static Fragment newInstance(String id, String name) {
        Bundle args = new Bundle();
        args.putString("TabId", id);
        args.putString("TabName", name);
        TopicListFragment fragment = new TopicListFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        id = (String) getArguments().get("TabId");
        name = (String) getArguments().get("TabName");
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
        return new TopicListViewModel(id, name);
    }

    @Override
    protected void onRetryBtnClick() {

    }

    @Override
    protected String getFragmentTag() {
        return null;
    }
}
