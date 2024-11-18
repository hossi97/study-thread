package ep01.daemonThread;

public class DaemonThread extends Thread {

  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + ": run()");
    try {
      Thread.sleep(10_000);
      System.out.println(Thread.currentThread().getName() + ": After 10s");
    } catch (InterruptedException e) {
      throw new RuntimeException(e);
    }
    System.out.println(Thread.currentThread().getName() + ": run() end");
  }
}
