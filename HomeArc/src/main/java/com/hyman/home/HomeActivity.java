package com.hyman.home;

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

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        fullScreen(this);
        setContentView(R.layout.home);
        ButterKnife.bind(this);


    }

    @OnClick({R.id.bt1, R.id.bt2})
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
        }
    }

}
