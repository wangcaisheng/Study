package com.hyman.discuzq;

import com.arch.demo.core.fragment.IBasePagingView;
import com.arch.demo.core.model.BaseModel;
import com.arch.demo.core.viewmodel.MvvmBaseViewModel;
import com.hyman.discuzq.bean.TopicBean;

import java.util.ArrayList;

/**
 * 在ViewMode中：
 * 1，实例化model
 * 2, 注册model处理数据的回调监听
 * 3，将viewmodel获取的数据通过接口传给view.
 */
public class TopicListViewModel extends MvvmBaseViewModel<TopicListViewModel.IView,TopicItemModel> implements BaseModel.IModelListener<TopicBean>{

    public TopicListViewModel(String id,String name){
        model=new TopicItemModel(id ,name);
        model.register(this);
        model.getCachedDataAndLoad();

    }


    public void refresh(){
        model.getCachedDataAndLoad();
    }

    @Override
    public void onLoadFinish(BaseModel model, TopicBean data) {
         getPageView().onTopicLoaded(data);
    }

    @Override
    public void onLoadFail(BaseModel model, String prompt) {

    }

    public interface IView extends IBasePagingView {
        void onTopicLoaded(TopicBean data);
    }
}
