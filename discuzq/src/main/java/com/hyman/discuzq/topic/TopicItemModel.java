package com.hyman.discuzq.topic;

import android.content.Intent;
import android.text.TextUtils;

import com.arch.demo.core.model.BaseModel;
import com.arch.demo.core.utils.LogUtil;
import com.arch.demo.network_api.beans.NewsListBean;
import com.arch.demo.network_api.errorhandler.ExceptionHandle;
import com.arch.demo.network_api.observer.BaseObserver;
import com.google.gson.reflect.TypeToken;
import com.hyman.discuzq.api.QHomeApi;
import com.hyman.discuzq.bean.QTabBean;
import com.hyman.discuzq.bean.TopicBean;

import java.lang.reflect.Type;

public class TopicItemModel extends BaseModel<TopicBean> {
    private String id;
    private String name;
    public TopicItemModel(String id,String name){
        this.id=id;
        this.name=name;
    }

    @Override
    public void refresh() {

    }

    /**
     * 加载数据
     */
    @Override
    protected void load() {
        QHomeApi.getInstance().getQHomeThemeList(new BaseObserver<TopicBean>(this) {
            @Override
            public void onError(ExceptionHandle.ResponeThrowable e) {
                LogUtil.e(e.toString());
            }

            @Override
            public void onNext(TopicBean topicBean) {
                loadSuccess(topicBean);
            }
        }, TextUtils.isEmpty(id)?1: Integer.parseInt(id));

    }

    @Override
    protected Type getTClass() {
        return new TypeToken<TopicBean>() {
        }.getClass();
    }
}
