package com.hyman.home.custom;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: Hyman
 * time: 2020/12/7 下午7:28
 * des:
 */
public class VisibleLeftLinearLayout extends LinearLayout {
    public VisibleLeftLinearLayout(Context context) {
        this(context,null);
    }

    public VisibleLeftLinearLayout(Context context, @Nullable AttributeSet attrs) {
        this(context, attrs,0);
    }

    private List<View> mVisView=new ArrayList<>();
    private List<View> mInVisView=new ArrayList<>();
    public VisibleLeftLinearLayout(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);


    }

    @Override
    public void onWindowFocusChanged(boolean hasWindowFocus) {
        super.onWindowFocusChanged(hasWindowFocus);
        int childCount = getChildCount();
        resortView(childCount);
    }

    private void resortView(int childCount) {
        if(childCount>1){
            mVisView.clear();
            mInVisView.clear();
            for (int i = 0; i < childCount; i++) {
                View childView= getChildAt(i);
                if(childView.getVisibility()==View.VISIBLE){
                    mVisView.add(childView);
                }else{
                    mInVisView.add(childView);
                }
            }
            this.removeAllViews();
            for (int i = 0; i <mVisView.size() ; i++) {
                this.addView(mVisView.get(i));
            }
            for (int i = 0; i <mInVisView.size() ; i++) {
                this.addView(mInVisView.get(i));
            }
        }
    }
}
