
import mypackage.Calculator;

public class fariya {
  public static void main(String[] args) {
    int a = 10;
    int b = 20;

    
    Calculator c = new Calculator();
    int sum = c.add(a, b);
    int sub = c.subtract(a, b); 
    System.out.println("Sum: " + sum);
    System.out.println("sub: " + sub);
  }
}
