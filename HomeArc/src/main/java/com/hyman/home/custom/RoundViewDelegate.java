package com.hyman.home.custom;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.view.View;

import com.arch.demo.core.utils.DensityUtil;

public class RoundViewDelegate {


    private final RectF roundRect = new RectF();
    private float rect_adius = 20;  //单位为像素
    private final Paint maskPaint = new Paint();
    private final Paint zonePaint = new Paint();
    private View mView;
    private Context mContext;

    public RoundViewDelegate(View view, Context context){
        this.mView = view;
        this.mContext = context;
        init();
    }

    private void init(){
        rect_adius= DensityUtil.dip2px(mContext,10);
        maskPaint.setAntiAlias(true);
        maskPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        //
        zonePaint.setAntiAlias(true);
        zonePaint.setColor(Color.WHITE);
    }

    /**
     * 从新设置圆角
     * @param adius
     */
    public void setRectAdius(float adius) {
        rect_adius = adius;
        if(mView != null){
            mView.invalidate();
        }
    }

    /**
     * 圆角区域设置
     * @param width
     * @param height
     */
    public void roundRectSet(int width,int height){
        roundRect.set(0, 0, width, height);
    }

    /**
     * 画布区域裁剪
     * @param canvas
     */
    public void canvasSetLayer(Canvas canvas){
        canvas.saveLayer(roundRect, zonePaint, Canvas.ALL_SAVE_FLAG);
//        canvas.drawRoundRect(roundRect, rect_adius, rect_adius, zonePaint);
        //
        canvas.drawPath(RoundedRect(roundRect.left,roundRect.top,roundRect.right, roundRect.bottom,rect_adius,rect_adius,true), zonePaint);
        canvas.saveLayer(roundRect, maskPaint, Canvas.ALL_SAVE_FLAG);
    }

    static public Path RoundedRect(float left, float top, float right, float bottom, float rx, float ry, boolean conformToOriginalPost) {
        Path path = new Path();
        if (rx < 0) rx = 0;
        if (ry < 0) ry = 0;
        float width = right - left;
        float height = bottom - top;
        if (rx > width/2) rx = width/2;
        if (ry > height/2) ry = height/2;
        float widthMinusCorners = (width - (2 * rx));
        float heightMinusCorners = (height - (2 * ry));

        path.moveTo(right, top + ry);
        path.rQuadTo(0, -ry, -rx, -ry);//top-right corner
        path.rLineTo(-widthMinusCorners, 0);
        path.rQuadTo(-rx, 0, -rx, ry); //top-left corner
        path.rLineTo(0, heightMinusCorners);

        if (conformToOriginalPost) {
            path.rLineTo(0, ry);
            path.rLineTo(width, 0);
            path.rLineTo(0, -ry);
        }
        else {
            path.rQuadTo(0, ry, rx, ry);//bottom-left corner
            path.rLineTo(widthMinusCorners, 0);
            path.rQuadTo(rx, 0, rx, -ry); //bottom-right corner
        }

        path.rLineTo(0, -heightMinusCorners);

        path.close();//Given close, last lineto can be removed.

        return path;
    }
}
