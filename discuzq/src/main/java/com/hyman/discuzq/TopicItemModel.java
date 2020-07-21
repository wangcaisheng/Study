package com.hyman.discuzq;

import com.arch.demo.core.model.BaseModel;
import com.arch.demo.network_api.beans.NewsListBean;
import com.arch.demo.network_api.errorhandler.ExceptionHandle;
import com.arch.demo.network_api.observer.BaseObserver;
import com.hyman.discuzq.api.QHomeApi;

public class TopicItemModel extends BaseModel {
    @Override
    public void refresh() {

    }

    @Override
    protected void load() {
        QHomeApi.getInstance().getQHomeThemeList(new BaseObserver<NewsListBean>(this) {
            @Override
            public void onError(ExceptionHandle.ResponeThrowable e) {

            }

            @Override
            public void onNext(NewsListBean newsListBean) {

            }
        },1);

    }
}
