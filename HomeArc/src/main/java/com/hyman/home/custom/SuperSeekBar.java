package com.hyman.home.custom;

import android.content.Context;
import android.os.Handler;
import android.os.Message;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.hyman.home.R;

/**
 * @author: Hyman
 * time: 2020/11/20 下午5:33
 * des:
 */
public class SuperSeekBar extends RelativeLayout {

    private SeekBar seekBar1;
    private SeekBar seekBar2;
    private TextView mTimeProgress;
    private TextView mTimeTotal;
    private LinearLayout llTime;
//    private WeakReference<HuoYingVideoView> weakReference;

    public SuperSeekBar(Context context) {
        this(context,null);
    }

    public SuperSeekBar(Context context, AttributeSet attrs) {
        this(context, attrs,0);
    }

    public SuperSeekBar(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        View view=View.inflate(context,R.layout.super_seekbar,null);
        addView(view);
//        addSeekBar1(context);
//        addSeekBar2(context);
        initView(view);
        initListener();
    }
    public int progress=0;
    private Handler handler=new Handler(){
        @Override
        public void handleMessage(@NonNull Message msg) {
            super.handleMessage(msg);
            if(msg.what==0){
                setProgress(progress++);
                if(progress==100){
                    progress=0;
                }
                handler.sendEmptyMessageDelayed(0,200);
            }
        }
    };

    private void initView(View view) {
        mTimeProgress = view.findViewById(R.id.tv_time_progress);
        mTimeTotal = view.findViewById(R.id.tv_time_total);
        llTime = view.findViewById(R.id.ll_time);

        seekBar1=(SeekBar) view.findViewById(R.id.seekbar1);
        seekBar2=(SeekBar) view.findViewById(R.id.seekbar2);
        seekBar2.setVisibility(GONE);
        setMax(100);
        handler.sendEmptyMessage(0);
    }


    private void initListener() {
        seekBar1.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                if(myDiySeekBarChangeListener!=null){
                    myDiySeekBarChangeListener.onDiyProgressChanged(seekBar,progress,fromUser);
                }
//                mTimeProgress.setText(TimeUtils.getHS(seekBar.getProgress()));
//                mTimeTotal.setText(TimeUtils.getHS(seekBar.getMax()));

                    seekBar2.setProgress(seekBar.getProgress());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {
                mIsFromUser=true;
                if(myDiySeekBarChangeListener!=null){
                    myDiySeekBarChangeListener.onDiyStartTrackingTouch(seekBar);
                }
                llTime.setVisibility(VISIBLE);
                seekBar2.setVisibility(View.VISIBLE);

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {
                mIsFromUser=false;
                if(myDiySeekBarChangeListener!=null){
                    myDiySeekBarChangeListener.onDiyStopTrackingTouch(seekBar);
                }
                llTime.setVisibility(GONE);
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        seekBar2.setVisibility(View.GONE);
                    }
                },1000);
                progress=seekBar.getProgress();
//                setProgress(seekBar.getProgress());
                //设置播放器进度
//                if(weakReference!=null && weakReference.get()!=null){
//                    HuoYingVideoView huoYingVideoView=weakReference.get();
//                    huoYingVideoView.seekTo(seekBar.getProgress());
//                }

            }
        });


        seekBar2.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                seekBar1.setProgress(seekBar.getProgress());

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {


            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
    public boolean mIsFromUser=false;

    public void setMax(int max){
//        weakReference=new WeakReference(videoView);
        if(seekBar1!=null && seekBar2!=null){
            seekBar1.setMax(max);
            seekBar2.setMax(seekBar1.getMax());
        }

    }

    public void setProgress(int progress){
        if(seekBar1!=null && seekBar2!=null){
            if(mIsFromUser){

            }else{
                seekBar1.setProgress(progress);
            }

        }
    }

    public OnDiySeekBarChangeListener myDiySeekBarChangeListener;

    public interface OnDiySeekBarChangeListener{
        void onDiyProgressChanged(SeekBar seekBar, int progress, boolean fromUser);
        void onDiyStartTrackingTouch(SeekBar seekBar);
        void onDiyStopTrackingTouch(SeekBar seekBar);
    }

    public void setOnSeekBarChangeListener(OnDiySeekBarChangeListener seekBarChangeListener){
        myDiySeekBarChangeListener=seekBarChangeListener;
    }
}
