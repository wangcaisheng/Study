package com.hyman.home.ui.activity;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import com.hyman.home.R;
import com.hyman.home.ViewPagerAndFragmentLazyLoad;
import com.hyman.home.diff.DiffActivity;
import com.hyman.home.diff.DiffActivity2;

import androidx.coordinatorlayout.widget.CoordinatorLayout;
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
    @BindView(R.id.bt9)
    Button bt9;
    @BindView(R.id.bt10)
    Button bt10;


    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setStatusBarColor(Color.RED);
        setContentView(R.layout.home);
        ButterKnife.bind(this);

        Log.e("Hyman","getExternalCacheDir()="+getExternalCacheDir().getPath());
        Log.e("Hyman","getExternalFilesDir(nim)="+getExternalFilesDir("nim").getPath());
        Log.e("Hyman","getCacheDir()="+getCacheDir().getPath());
        Log.e("Hyman","getFilesDir()="+getFilesDir().getPath());

    }

    @OnClick({R.id.bt1, R.id.bt2,R.id.bt3,R.id.bt4,R.id.bt5,R.id.bt6,R.id.bt7,R.id.bt8,R.id.bt9,R.id.bt10})
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
                startActivity(new Intent(this, KotlinActivity.class));
                break;
            case R.id.bt6:
                startActivity(new Intent(this, LiveDataActivity.class));
                break;
            case R.id.bt7:
                ViewPagerAndFragmentLazyLoad.startMe(this);
                break;
            case R.id.bt8:
                Alpa0Activity.startMe(this);
                break;
            case R.id.bt9:
                KotlinHomeActivity.startMe(this);
                break;
            case R.id.bt10:
                startActivity(new Intent(this,SpannableStringAct.class));
                break;
        }
    }

    public void bt11(View view){

    }

    /**
     * DiffUtil使用 AsyncListDiffer
     * @param view
     */
    public void bt12(View view) {
        startActivity(new Intent(this, DiffActivity.class));
    }

    /**
     * DiffUtil使用
     * @param view
     */
    public void bt13(View view) {
        startActivity(new Intent(this, DiffActivity2.class));
    }
}
