#include <unistd.h>
#include "Main.h"

JNIEXPORT jint JNICALL Java_Main_getpid
  (JNIEnv *env, jclass cls) {
  // call the actual C function to get the process id!
  return getpid();
}

