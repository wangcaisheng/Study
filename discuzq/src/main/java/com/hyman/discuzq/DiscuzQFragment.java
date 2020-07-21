package com.hyman.discuzq;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.arch.demo.core.activity.MvvmActivity;
import com.arch.demo.core.fragment.MvvmFragment;
import com.arch.demo.network_api.beans.NewsChannelsBean;
import com.arch.demo.network_api.beans.NewsListBean;
import com.arch.demo.network_api.errorhandler.ExceptionHandle;
import com.arch.demo.network_api.observer.BaseObserver;
import com.google.android.material.tabs.TabLayout;
import com.hyman.discuzq.api.QHomeApi;
import com.hyman.discuzq.bean.QTabBean;
import com.hyman.discuzq.databinding.FragmentHomeBinding;

import java.util.List;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class DiscuzQFragment extends MvvmActivity<FragmentHomeBinding,QHomeViewModel> implements QHomeViewModel.IView{


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        viewDataBinding.tablayout.setTabMode(TabLayout.MODE_SCROLLABLE);
        viewModel.refresh();
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

    @Override
    public void onTabLoaded(QTabBean qTabBean) {
       List<QTabBean.DataBean> dataBeans= qTabBean.getData();
        viewDataBinding.tablayout.removeAllTabs();
        for (QTabBean.DataBean channel : dataBeans) {
            viewDataBinding.tablayout.addTab(viewDataBinding.tablayout.newTab().setText(channel.getAttributes().getName()));
        }
        viewDataBinding.tablayout.scrollTo(0,0);
    }
}
