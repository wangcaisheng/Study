package com.hyman.discuzq;

import com.arch.demo.core.activity.IBaseView;
import com.arch.demo.core.model.BaseModel;
import com.arch.demo.core.viewmodel.MvvmBaseViewModel;
import com.hyman.discuzq.bean.QTabBean;

/**
 * @author: Hyman
 * time: 2020/7/18 下午8:12
 * des:
 */
public class QHomeViewModel extends MvvmBaseViewModel<QHomeViewModel.IView,TabModel> implements BaseModel.IModelListener<QTabBean> {

    public QHomeViewModel(){
        model = new TabModel();
        model.register(this);
    }

    public void refresh(){
        model.getCachedDataAndLoad();
    }

    @Override
    public void onLoadFinish(BaseModel model, QTabBean data) {
        getPageView().onTabLoaded(data);
    }

    @Override
    public void onLoadFail(BaseModel model, String prompt) {

    }

    public interface IView extends IBaseView {
        void onTabLoaded(QTabBean qTabBean);
    }
}
