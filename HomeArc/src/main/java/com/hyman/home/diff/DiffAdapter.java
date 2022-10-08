package com.hyman.home.diff;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.recyclerview.widget.AsyncDifferConfig;
import androidx.recyclerview.widget.AsyncListDiffer;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.hyman.home.R;

import java.util.List;

/**
 * 介绍：普普通的adapter，
 * 但是 唯一亮点~
 * public void onBindViewHolder(DiffVH holder, int position, List<Object> payloads)
 * 重写这个方法
 * 作者：zhangxutong
 * 邮箱：zhangxutong@imcoming.com
 * 时间： 2016/9/12.
 */

public class DiffAdapter extends RecyclerView.Adapter<DiffAdapter.DiffVH> {
    private final static String TAG = "zxt";
    private List<TestBean> mDatas;
    private Context mContext;
    private LayoutInflater mInflater;

    public DiffAdapter(Context mContext, List<TestBean> mDatas,boolean isSync) {
        this.mContext = mContext;
        this.mDatas = mDatas;
        mInflater = LayoutInflater.from(mContext);
        if (isSync) {
            DealDiff(this);
        }
    }

    private AsyncListDiffer<TestBean> mDiffer;

    /**
     * 处理Diff配置
     */
    public void DealDiff(DiffAdapter diffAdapter) {
        mDiffer = new AsyncListDiffer<TestBean>(new AdapterDiffListUpdateCallback(diffAdapter), new AsyncDifferConfig.Builder(new ItemCallBack()).build());
    }

    public void setDatas(List<TestBean> mDatas) {
        this.mDatas = mDatas;
    }

    @Override
    public DiffVH onCreateViewHolder(ViewGroup parent, int viewType) {
        return new DiffVH(mInflater.inflate(R.layout.item_diff, parent, false));
    }

    @Override
    public void onBindViewHolder(final DiffVH holder, final int position) {
        TestBean bean = mDatas.get(position);
        holder.tv1.setText(bean.getName());
        holder.tv2.setText(bean.getDesc());
        holder.iv.setImageResource(bean.getPic());
    }

    @Override
    public void onBindViewHolder(DiffVH holder, int position, List<Object> payloads) {
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position);
        } else {
            //文艺青年中的文青
            Bundle payload = (Bundle) payloads.get(0);//取出我们在getChangePayload（）方法返回的bundle
            TestBean bean = mDatas.get(position);//取出新数据源，（可以不用）
            for (String key : payload.keySet()) {
                switch (key) {
                    case "KEY_DESC":
                        //这里可以用payload里的数据，不过data也是新的 也可以用
                        holder.tv2.setText(bean.getDesc());
                        break;
                    case "KEY_PIC":
                        holder.iv.setImageResource(payload.getInt(key));
                        break;
                    default:
                        break;
                }
            }
        }
    }

    @Override
    public int getItemCount() {
        return mDatas != null ? mDatas.size() : 0;
    }

    public void submitList(List<TestBean> mNewDatas) {
        if(mDiffer != null) {
            mDiffer.submitList(mNewDatas);
        }
        this.mDatas = mNewDatas;
    }

    class DiffVH extends RecyclerView.ViewHolder {
        TextView tv1, tv2;
        ImageView iv;

        public DiffVH(View itemView) {
            super(itemView);
            tv1 = (TextView) itemView.findViewById(R.id.tv1);
            tv2 = (TextView) itemView.findViewById(R.id.tv2);
            iv = (ImageView) itemView.findViewById(R.id.iv);
        }
    }

    class ItemCallBack extends DiffUtil.ItemCallback<TestBean>{

        @Override
        public boolean areItemsTheSame(@NonNull TestBean beanOld, @NonNull TestBean beanNew) {

            return beanOld.getName().equals(beanNew.getName()); //默认两个data内容是相同的
        }

        @Override
        public boolean areContentsTheSame(@NonNull TestBean beanOld, @NonNull TestBean beanNew) {
            if (!beanOld.getDesc().equals(beanNew.getDesc())) {
                return false;//如果有内容不同，就返回false
            }
            if (beanOld.getPic() != beanNew.getPic()) {
                return false;//如果有内容不同，就返回false
            }
            return true; //默认两个data内容是相同的
        }
    }
}
