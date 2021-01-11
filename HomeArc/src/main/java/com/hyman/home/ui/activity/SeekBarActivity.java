package com.hyman.home.ui.activity;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.SeekBar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.arch.demo.core.utils.ToastUtil;
import com.hyman.home.R;

/**
 * @author: Hyman
 * time: 2020/10/15 上午11:11
 * des:
 */
public class SeekBarActivity extends AppCompatActivity implements View.OnClickListener {

    private SeekBar sb1;
    private SeekBar sb2;
    private SeekBar mOriSeekBar;

    public static void open(HomeActivity homeActivity) {
        homeActivity.startActivity(new Intent(homeActivity,SeekBarActivity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        fullScreen(this);
        setContentView(R.layout.home);
        initView();
        initView1();
        initOriSeekBar();
        //沉浸式状态栏是从4.4开始的

    }

    private void initOriSeekBar() {
        mOriSeekBar=findViewById(R.id.ori_seekbar);
        Rect bounds = mOriSeekBar.getProgressDrawable().getBounds();
        mOriSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                mOriSeekBar.setThumb(getResources().getDrawable(R.drawable.seekbar_thumb_white));
                mOriSeekBar.setProgressDrawable(getResources().getDrawable(R.drawable.my_seekbar_style_white));
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

                mOriSeekBar.setThumb(getResources().getDrawable(R.drawable.seekbar_thumb));
                mOriSeekBar.setProgressDrawable(getResources().getDrawable(R.drawable.my_seekbar_style));
                mOriSeekBar.getProgressDrawable().setBounds(bounds);
            }
        });
    }

    private void initView1() {
        findViewById(R.id.tv1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SubActivity.open(SeekBarActivity.this);
            }
        });
    }

    private void initView() {
        sb1 = findViewById(R.id.seekbar);
        sb2 = findViewById(R.id.seekbar1);

        sb1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sb2.setProgress(seekBar.getProgress());
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

                sb2.setVisibility(View.VISIBLE);

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        sb2.setVisibility(View.GONE);
                    }
                },1000);

            }
        });

        sb2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                sb1.setProgress(seekBar.getProgress());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }

    @Override
    public void onClick(View v) {
        ToastUtil.show(SeekBarActivity.this,"哈哈");
    }

    /**
     * 这个方法不能够把导航栏的位置也占
     * @param activity
     */
    private void fullScreen(Activity activity) {
        //4.4以上
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.KITKAT) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                //5.x开始需要把颜色设置透明，否则导航栏会呈现系统默认的浅灰色
                Window window = activity.getWindow();
                View decorView = window.getDecorView();
                //两个 flag 要结合使用，表示让应用的主体内容占用系统状态栏的空间
                int option = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                        | View.SYSTEM_UI_FLAG_LAYOUT_STABLE;
                decorView.setSystemUiVisibility(option);
                window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
                window.setStatusBarColor(Color.TRANSPARENT);
                //导航栏颜色设置无效；通过theme设置生效
//                window.setNavigationBarColor(Color.TRANSPARENT);//正设置无效；怎样设置导航栏也透明呢？
            } else {
                Window window = activity.getWindow();
                WindowManager.LayoutParams attributes = window.getAttributes();
                int flagTranslucentStatus = WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS;
                int flagTranslucentNavigation = WindowManager.LayoutParams.FLAG_TRANSLUCENT_NAVIGATION;
                attributes.flags |= flagTranslucentStatus;
//                attributes.flags |= flagTranslucentNavigation;
                window.setAttributes(attributes);
            }
        }
    }
}
