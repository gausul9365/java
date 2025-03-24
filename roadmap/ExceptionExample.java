public class ExceptionExample {
  public static void main(String[] args) {
      try {
          int result = 10 / 0; // This will cause ArithmeticException
      } catch (ArithmeticException e) {
          System.out.println("Error: Cannot divide by zero.");
      }
      System.out.println("Program continues...");
  }
}
