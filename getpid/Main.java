

class Main {
  public static void main(String[] args) {
	  System.loadLibrary("main");
    System.out.println("my process id: " + getpid());
  }

  private static native int getpid();
}

