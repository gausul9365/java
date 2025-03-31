
class Innertheads extends Thread   {

  public void run (){
    System.out.println ("Thread running: " + Thread.currentThread().getName());
  }

  
}




public class theads {
  public static void main(String[] args) {
    Innertheads t = new Innertheads();

    t.start();
  }
}
