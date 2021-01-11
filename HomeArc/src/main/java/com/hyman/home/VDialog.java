package com.hyman.home;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;


/**
 * Created by peter on 2018/2/2.
 */


public class VDialog extends Dialog {

    private TextView title;
    private TextView tv_submit;
    private TextView tv_submit_0;
    public Activity mContext;

    public VDialog(Activity context) {
        this(context, R.style.dialog);

    }
    public VDialog(Activity context, int themeResId) {
        super(context, themeResId);
        mContext=context;
        initUI();
    }

    protected VDialog(Context context, boolean cancelable, OnCancelListener cancelListener) {
        super(context, cancelable, cancelListener);
    }

    public void setTexts(String dex){
        title.setText(dex);
        tv_submit.setText("前往设置");
    }
    public void setTexts1(){
        tv_submit.setText("去设置");
        tv_submit_0.setText("取消");
    }
    private void initUI() {
        View view = getLayoutInflater().inflate(R.layout.v, null);
        title = (TextView) view.findViewById(R.id.title);
        tv_submit = (TextView) view.findViewById(R.id.tv_submit);
        tv_submit_0 = (TextView) view.findViewById(R.id.tv_submit_0);
        tv_submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click != null) {
                    click.onclick();
                }
            }
        });
        tv_submit_0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (click != null) {
                    click.onclick0( VDialog.this);
                }
            }
        });
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        view.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                 VDialog.this.dismiss();
                return false;
            }
        });
        super.setContentView(view);
    }
    private onClick click;

    public void setClick(onClick click) {
        this.click = click;
    }

    public interface onClick {
        void onclick();
        void onclick0( VDialog vDialog);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setGravity(Gravity.CENTER);

        WindowManager.LayoutParams attributes = getWindow().getAttributes();
//		attributes.x = 0; // 新位置X坐标
//		attributes.y = -20; // 新位置Y坐标

        attributes.width = 300;
        attributes.height =134;

        getWindow().setAttributes(attributes);


    }
}
