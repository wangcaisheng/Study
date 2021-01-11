package com.hyman.home.ui.activity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.Transformations;

import com.arch.demo.core.utils.ToastUtil;
import com.hyman.home.R;

/**
 * @author: Hyman
 * time: 2020/12/23 下午7:47
 * des:
 */
public class LiveDataActivity extends AppCompatActivity {

    private MutableLiveData<String> mutableLiveData;
    private MutableLiveData<String> mutableLiveData1;
    private MutableLiveData<String> mutableLiveData2;
    private MutableLiveData<Boolean> mutableLiveData3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_livedata);
        initView();
        mutableLiveData = new MutableLiveData<>();
        mutableLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                ToastUtil.show(LiveDataActivity.this,s);
                Log.d("hyman",s);
            }
        });
        transformationSwitchMap();
    }

    /**
     *  Transformations.map的使用
     */
    public void transformationMap(){
        LiveData transformedLiveData = Transformations.map(mutableLiveData, new Function<String, Object>() {
            @Override
            public Object apply(String name) {
                return name + "+Transformations.map添加的";
            }
        });

        transformedLiveData.observe(this, new Observer() {
            @Override
            public void onChanged(Object o) {
                ToastUtil.show(LiveDataActivity.this,o.toString());
                Log.d("hyman",o.toString());
            }
        });

    }

    /**
     *  Transformations.switchMap的使用
     */
    public void transformationSwitchMap(){
        mutableLiveData1 = new MutableLiveData<>();
        mutableLiveData2 = new MutableLiveData<>();
        mutableLiveData3 = new MutableLiveData<>();

        LiveData<String> stringLiveData = Transformations.switchMap(mutableLiveData3, new Function<Boolean, LiveData<String>>() {
            @Override
            public LiveData<String> apply(Boolean input) {
                if (input) {
                    return mutableLiveData1;
                } else {
                    return mutableLiveData2;
                }
            }
        });
        stringLiveData.observe(this, new Observer<String>() {
            @Override
            public void onChanged(String s) {
                ToastUtil.show(LiveDataActivity.this,s);
                Log.d("hyman",s);
            }
        });
        mutableLiveData1.postValue("我是mutableLiveData1");
        mutableLiveData2.postValue("我是mutableLiveData2");
    }

    /**
     * 合并多个LiveData数据源
     */
    public void mergeLivaData(){

    }



    private void initView() {
        findViewById(R.id.bt_send).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mutableLiveData.postValue("我是原始数据");
            }
        });

        findViewById(R.id.bt_send_delay).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                transformationMap();
                mutableLiveData.postValue("我是原始数据");
            }
        });

        findViewById(R.id.bt_send_switch).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mutableLiveData3.postValue(true);
            }
        });

        findViewById(R.id.bt_send_merge).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              mergeLivaData();
            }
        });
    }
}
