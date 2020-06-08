#include <jni.h>
#include <string>
#include<GLES2/gl2.h>
#include<GLES2/gl2ext.h>
//宏定义函数，用于字符串拼接
#define OPENGLFUN(arg) Java_com_panda_opengl_OpenGIManager##arg

//  onSurfaceCreated()方法
extern "C" JNIEXPORT void JNICALL
        OPENGLFUN(onSurfaceCreated)(
        JNIEnv* env,
        jobject /* this */) {
        glClearColor(0.0f, 0.0f, 1.0f, 1.0f);
}
extern "C" JNIEXPORT void JNICALL
        OPENGLFUN(onSurfaceChanged)(
        JNIEnv* env,
        jobject /* this */,
        jint width,
        jint height) {
        glViewport(0, 0, width, height);
}
extern "C" JNIEXPORT void JNICALL
        OPENGLFUN(onDrawFrame)(
        JNIEnv* env,
        jobject /* this */) {
        //设置色彩
        glClear(GL_COLOR_BUFFER_BIT);
}
