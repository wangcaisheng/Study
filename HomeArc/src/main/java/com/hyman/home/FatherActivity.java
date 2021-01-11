package com.hyman.home;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 * @author: Hyman
 * time: 2020/11/19 下午8:43
 * des:
 */
public class FatherActivity extends AppCompatActivity {

    public TextView content;
    public Button button;

    public static void open(SubActivity subActivity) {
        Intent intent=new Intent(subActivity,FatherActivity.class);
        subActivity.startActivity(intent);
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_father);
        initView();
    }

    private void initView() {
        button=findViewById(R.id.bt);
        content = findViewById(R.id.content);
    }
}
