package com.hyman.home.render;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;
import static android.opengl.GLES20.*;
/**
 * @author: Hyman
 * time: 2020/7/2 下午6:59
 * des:
 */
public class GLES3Render extends GLRender {

    private static final int BYTES_PER_FLOAT=4;
    private FloatBuffer vertexData=null;
    @Override
    public void onSurfaceCreated(GL10 gl, EGLConfig config) {
        //1，定义点集合（长方形点集合）
        float[] tableVertices={
                0f,0f,
                0f,14f,
                9f,14f,
                9f,0f
        };
        //2，openGl只能绘制：点 直线 三角形。
        float[] tableVerticesWithTriangles={
                //三角形1
                0f,0f,
                9f,14f,
                0f,14f,
                //三角形2
                0f,0f,
                9f,0f,
                9f,14f
        };

        //3，Java内存中的这些数据如何让OpenGL渲染？（1,jni 2,把内存从 Java堆拷贝到本地堆）
        //3.1 把内存从 Java堆拷贝到本地堆
        vertexData= ByteBuffer
                .allocateDirect(tableVerticesWithTriangles.length*BYTES_PER_FLOAT)
                .order(ByteOrder.nativeOrder())
                .asFloatBuffer();
        vertexData.put(tableVerticesWithTriangles);


        //设置清空屏幕用的颜色
      glClearColor(1.0f,0.0f,0.0f,0.0f);
    }

    @Override
    public void onSurfaceChanged(GL10 gl, int width, int height) {
        //渲染surface的大小
        glViewport(0,0,width,height);
    }

    @Override
    public void onDrawFrame(GL10 gl) {
        //清空屏幕
      glClear(GL_COLOR_BUFFER_BIT);
    }
}
