package ep01.runnable;

public class MainThread {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": main() start");

    UserRunnable runnable = new UserRunnable();
    Thread thread = new Thread(runnable);
    thread.start();

    System.out.println(Thread.currentThread().getName() + ": main() end");
  }
}