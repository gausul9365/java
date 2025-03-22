class Parent {
  void show() {
      System.out.println("Main parent class ka method hoon!");
  }
}

class Child extends Parent {
  @Override
  void show() {
      System.out.println("Main overridden method hoon, child class me!");
  }
}

public class Test {
  public static void main(String[] args) {
      Parent p = new Child();  // Runtime Polymorphism
      p.show();  
  }
}
