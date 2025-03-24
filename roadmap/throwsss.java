public class throwsss {
  static void riskymethod() throws ArithmeticException {
    throw new ArithmeticException("This is risky method");
  }

  public static void main(String[] args) {
      try {
          riskymethod();
      } catch (Exception e) {
          System.out.println("Error: " + e.getMessage());
      }
  }
}
