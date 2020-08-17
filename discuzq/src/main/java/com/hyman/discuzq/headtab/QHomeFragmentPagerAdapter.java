package com.hyman.discuzq.headtab;

import android.os.Parcelable;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentStatePagerAdapter;

import com.hyman.discuzq.topic.TopicListFragment;
import com.hyman.discuzq.bean.QTabBean;

import java.util.List;

public class QHomeFragmentPagerAdapter extends FragmentStatePagerAdapter {
    private List<QTabBean.DataBean> mTabs;

    public QHomeFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }
    
    @Override
    public Fragment getItem(int pos) {
        return TopicListFragment.newInstance(mTabs.get(pos).getId(), mTabs.get(pos).getAttributes().getName());
    }

    @Override
    public int getItemPosition(Object object) {
        return FragmentPagerAdapter.POSITION_NONE;
    }

    @Override
    public int getCount() {
        if(mTabs != null && mTabs.size() > 0) {
            return mTabs.size();
        }
        return 0;
    }

    @Override
    public void restoreState(Parcelable parcelable, ClassLoader classLoader){
    }

    public void setTabs(List<QTabBean.DataBean> dataBeans) {
        this.mTabs = dataBeans;
        notifyDataSetChanged();
    }
}