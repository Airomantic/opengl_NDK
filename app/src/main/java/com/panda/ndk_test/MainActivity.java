package com.panda.ndk_test;

import androidx.appcompat.app.AppCompatActivity;

import android.opengl.GLSurfaceView;
import android.os.Bundle;
import android.widget.TextView;

import com.panda.opengl.OpenGIManager;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Example of a call to a native method
        GLSurfaceView surfaceView = findViewById(R.id.gl_view);
        surfaceView.setRenderer(new GLSurfaceView.Renderer() {
            @Override
            public void onSurfaceCreated(GL10 gl, EGLConfig config) {
                // 为缓冲区 设置清除颜色的值 相当于初始化
                OpenGIManager.onSurfaceCreated();
            }

            @Override
            public void onSurfaceChanged(GL10 gl, int width, int height) {
                // 设置 视图 大小
                OpenGIManager.onSurfaceChanged(width,height);
            }

            @Override
            public void onDrawFrame(GL10 gl) {
                // 设置色彩
//                gl.glClear(gl.GL_COLOR_BUFFER_BIT);
                OpenGIManager.onDrawFrame();
            }
        });
    }


}
