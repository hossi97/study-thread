package ep01.daemonThread;

public class MainThread {
    public static void main(String[] args) {
      System.out.println(Thread.currentThread().getName() + ": main() start");
      DaemonThread daemonThread = new DaemonThread();
      daemonThread.setDaemon(true);
      daemonThread.start();
      System.out.println(Thread.currentThread().getName() + ": main() start");
      // 10초 기다리지 않고 바로 종료
    }
  }