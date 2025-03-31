
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class exe implements Runnable {
  public void run() {
    System.out.println("Thread name:" + Thread.currentThread().getName());
  }
}



public class maxTHread {
  public static void main(String[] args) {
    
    ExecutorService executer = Executors.newFixedThreadPool(5);
    
    
    for(int i=0; i<10;i++){
      executer.execute(new exe());
    }
    executer.shutdown();

   }
}



