package com.hyman.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.LinearLayout;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.view.GestureDetectorCompat;

import com.hyman.home.custom.MyOnTouch;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * @author: Hyman
 * time: 2020/12/4 上午11:20
 * des:
 */
public class GestureDetectorActivity extends AppCompatActivity  {
    @BindView(R.id.ll_touch)
    LinearLayout llTouch;
    @BindView(R.id.ll_gesture)
    LinearLayout llGesture;

    public static void open(HomeActivity homeActivity) {
        homeActivity.startActivity(new Intent(homeActivity, GestureDetectorActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gesture);
        ButterKnife.bind(this);
        initView();
    }

    private void initView() {
        llTouch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });


        llGesture.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                return false;
            }
        });
    }


}
