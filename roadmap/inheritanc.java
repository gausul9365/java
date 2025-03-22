class inherit {
  public void display() {
    System.out.println("Parent class method");
  }
}

class A extends inherit {
  public void display1() {
    System.out.println("Child class method");
  }

}


public class inheritanc {
  public static void main(String[] args) {
    A a = new A();
    a.display1();
    a.display();
  }
}
