class MyRunnable implements Runnable {
  public void run() {
      System.out.println("Runnable thread: " + Thread.currentThread().getName());
  }
}

public class RunnableExample {
  public static void main(String[] args) {
      Thread t1 = new Thread(new MyRunnable(), "GT");
      t1.start();
  }
}
