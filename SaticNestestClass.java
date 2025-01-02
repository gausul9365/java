class A{
 // int num = 10;  //error
  static class Nested{
      
    
    void show(int num){
     // System.out.println(num); this will give error because static class can't access non-static members of the outer class
    // this.num = num; // this and super keyword cannot be used in static context.
      System.out.println("Nested class");
    }
      
  }
}

// yha pe nested class bnaya gya hai jo static hai, A.Nested n = new A.Nested(); 

public class SaticNestestClass {
  public static void main(String[] args) {
    A.Nested n = new A.Nested();
    //n.show();  //error
  }
}