package ep01.runnable;

public class UserRunnable implements Runnable {
  @Override
  public void run() {
    System.out.println(Thread.currentThread().getName() + ": run()");
  }
}
