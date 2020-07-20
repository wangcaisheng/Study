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

import com.arch.demo.core.fragment.MvvmFragment;
import com.arch.demo.network_api.beans.NewsChannelsBean;
import com.arch.demo.network_api.beans.NewsListBean;
import com.arch.demo.network_api.errorhandler.ExceptionHandle;
import com.arch.demo.network_api.observer.BaseObserver;
import com.hyman.discuzq.api.QHomeApi;
import com.hyman.discuzq.databinding.FragmentHomeBinding;

import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;

public class DiscuzQFragment extends AppCompatActivity{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentHomeBinding viewBinding=DataBindingUtil.setContentView(this,R.layout.fragment_home);
        //加载数据
//        QHomeApi.getInstance().getQHomeThemeList(new Observer<NewsListBean>() {
//            @Override
//            public void onSubscribe(Disposable d) {
//
//            }
//
//            @Override
//            public void onNext(NewsListBean newsListBean) {
//
//            }
//
//            @Override
//            public void onError(Throwable e) {
//
//            }
//
//            @Override
//            public void onComplete() {
//
//            }
//        });

        QHomeApi.getInstance().getQTopicList(new Observer<NewsChannelsBean>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(NewsChannelsBean newsListBean) {

            }

            @Override
            public void onError(Throwable e) {

            }

            @Override
            public void onComplete() {

            }
        });
    }
}
