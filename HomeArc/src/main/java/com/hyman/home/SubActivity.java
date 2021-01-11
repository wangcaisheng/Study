package com.hyman.home;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;

/**
 * @author: Hyman
 * time: 2020/11/19 下午8:43
 * des:
 */
public class SubActivity extends FatherActivity{


    public static void open(Activity activity) {
        Intent intent=new Intent(activity,SubActivity.class);
        activity.startActivity(intent);
    }
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        content.setText("I am child");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FatherActivity.open(SubActivity.this);
            }
        });
    }
}
