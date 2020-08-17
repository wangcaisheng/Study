package com.hyman.discuzq.topic;

import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import com.arch.demo.common.views.picturetitleview.PictureTitleView;
import com.arch.demo.common.views.picturetitleview.PictureTitleViewViewModel;
import com.arch.demo.common.views.titleview.TitleView;
import com.arch.demo.common.views.titleview.TitleViewViewModel;
import com.arch.demo.core.customview.BaseCustomViewModel;
import com.arch.demo.core.recyclerview.BaseViewHolder;
import com.hyman.discuzq.bean.TopicBean;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Hyman
 * time: 2020/7/23 下午4:10
 * des:
 */
public class TopicItemRVAdapter extends RecyclerView.Adapter<BaseViewHolder>{
    private List<TopicBean.DataRoot> mItems;
    private final int VIEW_TYPE_PICTURE_TITLE = 1;
    private final int VIEW_TYPE_TITLE = 2;
    private TopicBean mData;


    void setData(List<TopicBean.DataRoot> items) {
        mItems = items;
        notifyDataSetChanged();
    }

    void setData(TopicBean data){
        this.mData=data;
        setData(data.getData());
    }



    @Override
    public int getItemCount() {
        if(mItems != null && mItems.size() > 0) {
            return mItems.size();
        }
        return 0;
    }

    @Override
    public int getItemViewType(int position) {
//        if(mItems.get(position) instanceof PictureTitleViewViewModel){
//            return VIEW_TYPE_PICTURE_TITLE;
//        } else if(mItems.get(position) instanceof TitleViewViewModel){
//            return VIEW_TYPE_TITLE;
//        }
        return -1;
    }
    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if(viewType == VIEW_TYPE_PICTURE_TITLE) {
            PictureTitleView pictureTitleView = new PictureTitleView(parent.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            pictureTitleView.setLayoutParams(layoutParams);
            return new BaseViewHolder(pictureTitleView);
        } else if(viewType == VIEW_TYPE_TITLE) {
            TitleView titleView = new TitleView(parent.getContext());
            RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
            titleView.setLayoutParams(layoutParams);
            return new BaseViewHolder(titleView);
        }
        return null;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
//        holder.bind(mItems.get(position));
    }
}
