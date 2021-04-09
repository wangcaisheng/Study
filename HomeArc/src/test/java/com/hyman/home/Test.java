package com.hyman.home;

import android.util.Log;

import com.hyman.home.util.SpUtil;

/**
 * @author: Hyman
 * time: 2021/1/29 下午7:32
 * des:
 */

public class Test {
    @org.junit.Test
    public void getSpValue(){
        SpUtil.INSTANCE.putValue(HomeBaseApplication.context);
        Log.d("Test","name="+SpUtil.INSTANCE.getString(HomeBaseApplication.context,"name"));
        assert 1==1;
    }
}
