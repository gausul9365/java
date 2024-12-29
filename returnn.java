class A {
  int a(){
    return 5;
  }
// It is used to exit from the method.
// It is not allowed to use return keyword in void method.
// The value passed with return keyword must match with return type of the method.
}

public class returnn {
  public static void main(String[] args) {
    A a1 = new A();
    System.out.println(a1.a());
    
  }
}
