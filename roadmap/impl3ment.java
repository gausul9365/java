
interface Animal {
  void eat();
} 

 class B implements Animal {
  public void eat() {
    System.out.println("B is eating");
  }
}


public class impl3ment {
public static void main(String[] args) {
  Animal a = new B();
  a.eat();
}  
}
