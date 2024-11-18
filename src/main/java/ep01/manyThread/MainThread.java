package ep01.manyThread;

import ep01.util.CustomLogger;

public class MainThread {

  public static void main(String[] args) {
    CustomLogger.log("start");
    UserRunnable runnable = new UserRunnable();
    for (int i = 0; i < 100; i++) {
      Thread thread = new Thread(() -> CustomLogger.log("run()")); // 익명 클래스로도 가능하고, Functional Interface 이므로 람다식으로 사용 가능
      thread.start();
    }
    CustomLogger.log("end");
  }

  static class UserRunnable implements Runnable {

    @Override
    public void run() {
      CustomLogger.log("run()");
    }
  }

}
