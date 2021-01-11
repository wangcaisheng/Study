package com.hyman.home.ui.activity;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.hyman.home.VDialog;

/**
 * @author: Hyman
 * time: 2021/1/8 下午1:06
 * des:
 */
public class Alpa0Activity extends AppCompatActivity {

    public static void startMe(HomeActivity homeActivity) {
        homeActivity.startActivity(new Intent(homeActivity,Alpa0Activity.class));
    }

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        Window window=getWindow();
//        WindowManager.LayoutParams wl = window.getAttributes();
//        wl.flags=WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON;
//       //这句就是设置窗口里控件的透明度的．０.０全透明．１.０不透明．
//        wl.alpha=1.0f;
//        window.setAttributes(wl);
//
//        TextView textView=new TextView(this);
//        textView.setText("透明的我");
//        setContentView(textView);
        showDialog();
    }

    private void showDialog() {
        VDialog vDialog = new VDialog(Alpa0Activity.this);
        vDialog.setTexts("开启悬浮窗权限，锁屏更稳定");
        vDialog.setClick(new VDialog.onClick() {
            @Override
            public void onclick() {
                vDialog.dismiss();
            }

            @Override
            public void onclick0(VDialog vDialog) {
                vDialog.dismiss();
            }
        });
        vDialog.setCancelable(true);
        vDialog.setCanceledOnTouchOutside(true);
        vDialog.show();
    }
}
