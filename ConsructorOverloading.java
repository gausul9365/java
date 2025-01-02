
class A {

   A(){
      System.out.println("no paramater passed");
   }
   A(int a, int b){
      System.out.println("Sum: " + (a + b));
   }

   A(int a){
      System.out.println(a);
   }
}


public class ConsructorOverloading {

   public static void main(String[] args) {
      A a1 = new A();
      A a3 = new A(10, 20);
      A a4 = new A(10);

      // a1.display();
      // a2.display();
      // a4.display();
   }
}