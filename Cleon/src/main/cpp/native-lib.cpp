#include <jni.h>
#include <string>

extern "C" JNIEXPORT jstring JNICALL
Java_com_tech_ssylix_cleon_Cleon_Cleon_stringFromJNI(
        JNIEnv *env,
        jobject /* this */) {
    std::string hello = "Hello from C++";
    return env->NewStringUTF(hello.c_str());
}
