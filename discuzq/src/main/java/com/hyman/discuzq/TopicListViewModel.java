package com.hyman.discuzq;

import com.arch.demo.core.model.BaseModel;
import com.arch.demo.core.viewmodel.MvvmBaseViewModel;

import java.util.ArrayList;

/**
 * 在ViewMode中：
 * 1，实例化model
 * 2, 注册model处理数据的回调监听
 * 3，将viewmodel获取的数据通过接口传给view.
 */
public class TopicListViewModel extends MvvmBaseViewModel<TopicListViewModel.IView,TopicItemModel> implements BaseModel.IModelListener{

    public TopicListViewModel(){
        model=new TopicItemModel();
        model.register(this);

    }


    public void refresh(){
        model.getCachedDataAndLoad();
    }

    @Override
    public void onLoadFinish(BaseModel model, Object data) {

    }

    @Override
    public void onLoadFail(BaseModel model, String prompt) {

    }

    public interface IView {
    }
}
