public class throwss {
  
  static void checkAge(int age){
    if(age < 18){
      throw new ArithmeticException("Not valid");
     }
     else{
      System.out.println("Welcome to vote");
     }
  
  }
public static void main(String[] args) {
checkAge(19);
}
}

