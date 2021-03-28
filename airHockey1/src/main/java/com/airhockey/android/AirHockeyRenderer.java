/***
 * Excerpted from "OpenGL ES for Android",
 * published by The Pragmatic Bookshelf.
 * Copyrights apply to this code. It may not be used to create training material, 
 * courses, books, articles, and the like. Contact us if you are in doubt.
 * We make no guarantees that this code is fit for any purpose. 
 * Visit http://www.pragmaticprogrammer.com/titles/kbogla for more book information.
***/
package com.airhockey.android;
import static android.opengl.GLES20.GL_COLOR_BUFFER_BIT;
import static android.opengl.GLES20.GL_FLOAT;
import static android.opengl.GLES20.GL_LINES;
import static android.opengl.GLES20.GL_POINTS;
import static android.opengl.GLES20.GL_TRIANGLES;
import static android.opengl.GLES20.glClear;
import static android.opengl.GLES20.glClearColor;
import static android.opengl.GLES20.glDrawArrays;
import static android.opengl.GLES20.glEnableVertexAttribArray;
import static android.opengl.GLES20.glGetAttribLocation;
import static android.opengl.GLES20.glGetUniformLocation;
import static android.opengl.GLES20.glUniform4f;
import static android.opengl.GLES20.glUseProgram;
import static android.opengl.GLES20.glVertexAttribPointer;
import static android.opengl.GLES20.glViewport;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import android.content.Context;
import android.opengl.GLSurfaceView.Renderer;

import com.airhockey.android.util.LoggerConfig;
import com.airhockey.android.util.ShaderHelper;
import com.airhockey.android.util.TextResourceReader;

public class AirHockeyRenderer implements Renderer {
    private static final String U_COLOR = "u_Color";
    private static final String A_POSITION = "a_Position";    
    private static final int POSITION_COMPONENT_COUNT = 2;
    //每一个坐标分量占几个字节
    private static final int BYTES_PER_FLOAT = 4;
    //本地内存索引
    private final FloatBuffer vertexData;
    private final Context context;
    private int program;
    private int uColorLocation;
    private int aPositionLocation;

    public AirHockeyRenderer() {
        // This constructor shouldn't be called -- only kept for showing
        // evolution of the code in the chapter.
        context = null;
        vertexData = null;
    }

    public AirHockeyRenderer(Context context) {
        this.context = context;
        /**
         * openGl将屏幕（无论屏幕是什么形状的）的坐标定义在【-1,1】范围
         */
        float[] tableVerticesWithTriangles = {
            // Triangle 1
            -0.5f, -0.5f, 
             0.5f,  0.5f,
            -0.5f,  0.5f,

            // Triangle 2
            -0.5f, -0.5f, 
             0.5f, -0.5f, 
             0.5f,  0.5f,

            // Line 1
            -0.5f, 0f, 
             0.5f, 0f,

            // Mallets
            0f, -0.25f, 
            0f,  0.25f
        };
        //ByteBuffer开辟本地内存,用于存放定点坐标，方便opengl的存取。 OpenGL是本地库，不能访问dalvik内存中的
        //数据，需要将dalvik中数据复制到本地内存中。
        vertexData = ByteBuffer
                //本地内存大小
            .allocateDirect(tableVerticesWithTriangles.length * BYTES_PER_FLOAT)
                //存放顺序
            .order(ByteOrder.nativeOrder())
                //转成float类型
            .asFloatBuffer();
        //吧数据从Java堆复制到本地堆
        vertexData.put(tableVerticesWithTriangles);
    }


    @Override
    public void onSurfaceCreated(GL10 glUnused, EGLConfig config) {
        /*
		// Set the background clear color to red. The first component is red,
		// the second is green, the third is blue, and the last component is
		// alpha, which we don't use in this lesson.
		glClearColor(1.0f, 0.0f, 0.0f, 0.0f);
         */
         //设置清屏颜色（参数rgba）
        glClearColor(0.0f, 0.0f, 0.0f, 0.0f);

        //1,从资源文件读取顶点着色器和片段着色器
        String vertexShaderSource = TextResourceReader
            .readTextFileFromResource(context, R.raw.simple_vertex_shader);
        String fragmentShaderSource = TextResourceReader
            .readTextFileFromResource(context, R.raw.simple_fragment_shader);
         //2,编译并加载定点着色器和片段着色器
        int vertexShader = ShaderHelper.compileVertexShader(vertexShaderSource);
        int fragmentShader = ShaderHelper.compileFragmentShader(fragmentShaderSource);
        //3，将定点着色器、片段着色器链接在一起生产opengl程序
        program = ShaderHelper.linkProgram(vertexShader, fragmentShader);

        if (LoggerConfig.ON) {
            ShaderHelper.validateProgram(program);
        }
        //4,告诉opengl在绘制任何东西到屏幕上时使用这里定义的程序
        glUseProgram(program);
         // 获取 uniform（u_Color 片段着色器中定义）位置
        uColorLocation = glGetUniformLocation(program, U_COLOR);
         // 获取属性的位置（a_Position 顶点着色器中定义）
        aPositionLocation = glGetAttribLocation(program, A_POSITION);
        
        // Bind our data, specified by the variable vertexData, to the vertex
        // attribute at location A_POSITION_LOCATION.
        //5，从本地内存缓冲区的开头读取数据
        vertexData.position(0);
        /**
         * int indx, 属性位置（顶点着色器位置属性）
         * int size, 这个属性有几个分量（我们定义顶点位置用了x y两个分量）
         * int type,  这个属性数据类型（我们用的是浮点类型）
         * boolean normalized,只有使用整型数据时才有意义
         * int stride, 只有当一个数组存储多于一个属性时才有意义（我们只定义了一个位置属性）
         * Buffer ptr 告诉opengl去哪里读取数据
         */
        //6，关联属性和顶点数据的数组
        glVertexAttribPointer(aPositionLocation, POSITION_COMPONENT_COUNT, GL_FLOAT, 
            false, 0, vertexData);
         //7，让这个属性生效
        glEnableVertexAttribArray(aPositionLocation);
    }

    /**
     * onSurfaceChanged is called whenever the surface has changed. This is
     * called at least once when the surface is initialized. Keep in mind that
     * Android normally restarts an Activity on rotation, and in that case, the
     * renderer will be destroyed and a new one created.
     * 
     * @param width
     *            The new width, in pixels.
     * @param height
     *            The new height, in pixels.
     */
    @Override
    public void onSurfaceChanged(GL10 glUnused, int width, int height) {
        // Set the OpenGL viewport to fill the entire surface.
        glViewport(0, 0, width, height);		
    }

    /**
     * OnDrawFrame is called whenever a new frame needs to be drawn. Normally,
     * this is done at the refresh rate of the screen.
     */
    @Override
    public void onDrawFrame(GL10 glUnused) {
        // Clear the rendering surface.
        glClear(GL_COLOR_BUFFER_BIT);
        
        // Draw the table.
        //指定片段着色器颜色
        glUniform4f(uColorLocation, 1.0f, 1.0f, 1.0f, 1.0f);
        /**
         *  指定画三角形
         *   画三角形数据索引（位置分量在数组中索引）
         *    用了几个分量
         */
        glDrawArrays(GL_TRIANGLES, 0, 6);
        
        // Draw the center dividing line.
        glUniform4f(uColorLocation, 1.0f, 0.0f, 0.0f, 1.0f);		
        glDrawArrays(GL_LINES, 6, 2); 
        
        // Draw the first mallet blue.        
        glUniform4f(uColorLocation, 0.0f, 0.0f, 1.0f, 1.0f);		
        glDrawArrays(GL_POINTS, 8, 1);

        // Draw the second mallet red.
        glUniform4f(uColorLocation, 1.0f, 0.0f, 0.0f, 1.0f);		
        glDrawArrays(GL_POINTS, 9, 1);
    }
}
