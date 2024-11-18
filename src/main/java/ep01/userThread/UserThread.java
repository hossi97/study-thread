package ep01.userThread;

public class UserThread extends Thread {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + ": run()");
  }
}
