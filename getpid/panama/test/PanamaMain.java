package panama.test;

import java.lang.invoke.*;
import jdk.incubator.foreign.*;

class PanamaMain {
  public static void main(String[] args) throws Throwable {
    // get System linker
    var linker = CLinker.getInstance();
    var lookup = LibraryLookup.ofDefault();

    // get a native method handle for 'getpid' function
    var getpid = linker.downcallHandle(
           lookup.lookup("getpid").get(),
           MethodType.methodType(int.class),
           FunctionDescriptor.of(CLinker.C_INT));

    // invoke it!
    System.out.println((int)getpid.invokeExact());
  }
}

