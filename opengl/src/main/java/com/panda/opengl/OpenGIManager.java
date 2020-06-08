package com.panda.opengl;

/**
 * @author jiangzq
 * @description:
 * @date :2020/6/8 11:52
 */
public class OpenGIManager {

    /**
     * Used to load the 'native-lib' library on application startup.
     *  初始化要放到SDK里面，之后引入原生应用
     *  这样原生应用就继承这个jar包和底下打包出来的so文件，才能使用这个Module对应的功能
     */
    static { //加载C/C++的动态链接库的java语法
        System.loadLibrary("opengl-lib");
    }
    /**
     * 注意这里没有返回值String
     */
    public static native void onSurfaceCreated();
    public static native void onSurfaceChanged(int width,int height);
    public static native void onDrawFrame();

}
