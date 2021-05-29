#!/usr/bin/env bash

# Adapted for the Linux operating system from:
# https://inside.java/2020/10/06/jextract/

# Compile the class, and generate the corresponding header file

javac -h . Main.java

# Compile the C code into a dynamic library so that JVM can load it

cc -shared -o libmain.so -I $JAVA_HOME/include -I $JAVA_HOME/include/linux Main.c

# Running

java -Djava.library.path=. Main

