package com.hyman.discuzq.headtab;
import androidx.annotation.Nullable;

import android.os.Bundle;

import com.arch.demo.core.activity.MvvmActivity;
import com.google.android.material.tabs.TabLayout;
import com.hyman.discuzq.R;
import com.hyman.discuzq.bean.QTabBean;
import com.hyman.discuzq.databinding.FragmentHomeBinding;

import java.util.List;

public class DiscuzQFragment extends MvvmActivity<FragmentHomeBinding, QHomeViewModel> implements QHomeViewModel.IView{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding.tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        viewModel.refresh();
        initTabs();
    }

    @Override
    protected void onRetryBtnClick() {

    }

    @Override
    protected QHomeViewModel getViewModel() {
        return new QHomeViewModel();
    }

    @Override
    public int getBindingVariable() {
        return 0;
    }

    @Override
    public int getLayoutId() {
        return R.layout.fragment_home;
    }

    QHomeFragmentPagerAdapter  mAdapter;
    public void initTabs() {
        mAdapter = new QHomeFragmentPagerAdapter(getSupportFragmentManager());
        viewDataBinding.viewpager.setAdapter(mAdapter);
        viewDataBinding.viewpager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(viewDataBinding.tablayout));
        viewDataBinding.viewpager.setOffscreenPageLimit(1);
        //绑定tab点击事件
        viewDataBinding.tablayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewDataBinding.viewpager.setCurrentItem(tab.getPosition());
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
    @Override
    public void onTabLoaded(QTabBean qTabBean) {
        List<QTabBean.DataBean> dataBeans= qTabBean.getData();
        mAdapter.setTabs(dataBeans);
        viewDataBinding.tablayout.removeAllTabs();
        for (QTabBean.DataBean channel : dataBeans) {
            viewDataBinding.tablayout.addTab(viewDataBinding.tablayout.newTab().setText(channel.getAttributes().getName()));
        }
        viewDataBinding.tablayout.scrollTo(0,0);
    }
}
