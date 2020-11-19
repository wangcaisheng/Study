package com.hyman.home.render;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

/**
 * 静态导入
 */


/**
 * @author: Hyman
 * time: 2020/7/2 下午6:27
 * des: 渲染器
 */
public abstract class GLRender implements GLSurfaceView.Renderer {
//    @Override
//    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
//        //设置清空屏幕用的颜色
//      glClearColor(1.0f,0.0f,0.0f,0.0f);
//    }
//
//    @Override
//    public void onSurfaceChanged(GL10 gl, int width, int height) {
//        //渲染surface的大小
//        glViewport(0,0,width,height);
//    }
//
//    @Override
//    public void onDrawFrame(GL10 gl) {
//        //清空屏幕
//      glClear(GL_COLOR_BUFFER_BIT);
//    }

    public int loadShader(int type, String shaderCode){
        //根据type创建顶点着色器或者片元着色器
        int shader = GLES20.glCreateShader(type);
        //将资源加入到着色器中，并编译
        GLES20.glShaderSource(shader, shaderCode);
        GLES20.glCompileShader(shader);
        return shader;
    }
}
