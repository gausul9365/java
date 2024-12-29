 class A {

private String msg = "private cant access from the outer class ";

private void display(){
  System.out.println("method is also cant be accesed from out side");
}   
  
}

public class privatte {
  public static void main(String[] args) {
    A a = new A();

   // System.out.println(a.msg); // gives error coz cant acces from out side

   //a.display(); // give error cant access coz it is private
   //even class are also cant be accessed 
  }

  
}

 /*
  * The private access modifier is accessible only within the same class.
  We can't assign private to outer class and interface.
  The best use of private keyword is to create a fully encapsulated class in Java by making all the data members of that class private.
  If we make any class constructor private, we cannot create the instance of that class from outside the class.
  */
