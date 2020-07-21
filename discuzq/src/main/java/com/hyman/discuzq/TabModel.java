package com.hyman.discuzq;

import com.arch.demo.core.model.BaseModel;
import com.arch.demo.core.utils.LogUtil;
import com.arch.demo.network_api.beans.NewsChannelsBean;
import com.arch.demo.network_api.errorhandler.ExceptionHandle;
import com.arch.demo.network_api.observer.BaseObserver;
import com.google.gson.reflect.TypeToken;
import com.hyman.discuzq.api.QHomeApi;
import com.hyman.discuzq.bean.QTabBean;

import java.lang.reflect.Type;

/**
 * @author: Hyman
 * time: 2020/7/20 下午7:38
 * des:
 */
public class TabModel extends BaseModel<QTabBean>{


    @Override
    public void refresh() {

    }

    @Override
    protected void load() {
      QHomeApi.getInstance().getQTopicList(new BaseObserver<QTabBean>(this) {
          @Override
          public void onError(ExceptionHandle.ResponeThrowable e) {
              LogUtil.e(e.toString());
          }

          @Override
          public void onNext(QTabBean newsChannelsBean) {
              //将拿到的数据传给viewModel,
              loadSuccess(newsChannelsBean);
          }
      });
    }

    @Override
    protected Type getTClass() {
        return new TypeToken<QTabBean>(){}.getClass();
    }
}
