package ep01.userThread;

public class MainThread {
  public static void main(String[] args) {
    System.out.println(Thread.currentThread().getName() + ": main() start");

    UserThread helloThread = new UserThread();
    System.out.println(Thread.currentThread().getName() + ": helloThread.start() 호출 전");
    helloThread.start();
    System.out.println(Thread.currentThread().getName() + ": helloThread.start() 호출 후");

    System.out.println(Thread.currentThread().getName() + ": main() end");
  }
}
