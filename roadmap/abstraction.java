
abstract class Car {
  abstract void run();
  abstract void stop();
}

class Audi extends Car {
  void run() {
    System.out.println("Audi is running");
  }
  void stop() { 
   
    System.out.println("Audi is stopped");
  }
}



public class abstraction {
  public static void main(String[] args) {
    Car c = new Audi();
      c.run();
      c.stop();
    
  }
  
}
