package com.hyman.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * @author: Hyman
 * time: 2020/10/15 上午11:11
 * des:
 */
public class HomeActivity extends AppCompatActivity {


    @BindView(R.id.bt1)
    Button bt1;
    @BindView(R.id.bt2)
    Button bt2;
    @BindView(R.id.bt3)
    Button bt3;
    @BindView(R.id.bt4)
    Button bt4;
    @BindView(R.id.bt5)
    Button bt5;
    @BindView(R.id.bt6)
    Button bt6;
    @BindView(R.id.bt7)
    Button bt7;
    @BindView(R.id.bt8)
    Button bt8;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        fullScreen(this);
        setContentView(R.layout.home);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.bt1, R.id.bt2,R.id.bt3,R.id.bt4,R.id.bt5,R.id.bt6,R.id.bt7,R.id.bt8})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.bt1:
                SeekBarActivity.open(this);
                break;
            case R.id.bt2:
                GestureDetectorActivity.open(this);
                break;
            case R.id.bt3:
                break;
            case R.id.bt4:
                CustomViewActivity.open(this);
                break;
            case R.id.bt5:
                startActivity(new Intent(this,KotlinActivity.class));
                break;
            case R.id.bt6:
                startActivity(new Intent(this,LiveDataActivity.class));
                break;
            case R.id.bt7:
                ViewPagerAndFragmentLazyLoad.startMe(this);
                break;
            case R.id.bt8:
                Alpa0Activity.startMe(this);
                break;
        }
    }


}
