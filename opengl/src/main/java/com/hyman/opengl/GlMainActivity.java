package com.hyman.opengl;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.pm.ConfigurationInfo;
import android.opengl.GLSurfaceView;
import android.os.Bundle;

import com.arch.demo.core.utils.LogUtil;
import com.hyman.opengl.render.Square;
import com.hyman.opengl.render.TriangleRender;
import com.hyman.opengl.render.GLRender;

public class GlMainActivity extends AppCompatActivity {

    private GLSurfaceView glSurfaceView;
    private boolean isRenderSet = false;
    private GLRender render;

    @SuppressLint("ServiceCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_gl_main);
        //1,创建GLSurfaceView实例
        glSurfaceView = new GLSurfaceView(this);

        //2，检查支持的OPenGl 版本
        ActivityManager activityManager = (ActivityManager) getSystemService(Context.ACTIVITY_SERVICE);
        ConfigurationInfo configurationInfo = activityManager.getDeviceConfigurationInfo();

        //3，给GLSurfaceView设置渲染器
//        if (configurationInfo.reqGlEsVersion >= 0x30000) {
//            //3.1 设置OPenGl版本
//            glSurfaceView.setEGLContextClientVersion(3);
////            render = new GLES3Render();
//            render=new GLES201Render();
//            LogUtil.e("渲染器版本："+3);
//            glSurfaceView.setRenderer(render);
//            isRenderSet=true;
//        } else
        if (configurationInfo.reqGlEsVersion >= 0x20000) {
            glSurfaceView.setEGLContextClientVersion(2);
//            render = new GLES2Render();
            //三角形
            render = new TriangleRender();
            //正方形
            render = new Square();
            LogUtil.e("渲染器版本：" + 2);
            glSurfaceView.setRenderer(render);
            isRenderSet = true;
        } else {
            throw new RuntimeException("Needs GLESv2 or higher");
        }

        /*渲染方式，RENDERMODE_WHEN_DIRTY表示被动渲染，只有在调用requestRender或者onResume等方法时才会进行渲染。RENDERMODE_CONTINUOUSLY表示持续渲染*/
        glSurfaceView.setRenderMode(GLSurfaceView.RENDERMODE_WHEN_DIRTY);
        /**
         * 设置glSurfaceView为视图
         */
        setContentView(glSurfaceView);
//

    }

    //4，GLSurfaceView 关联Activity 生命周期 (后台渲染线程的 暂停 继续)
    @Override
    protected void onResume() {
        super.onResume();
        if (isRenderSet) {
            glSurfaceView.onResume();
        }
    }

    @Override
    protected void onPause() {
        super.onPause();
        if (isRenderSet) {
            glSurfaceView.onPause();
        }
    }
}
