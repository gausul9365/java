import java.util.Scanner;

public class Char {

  public static void main(String[] args) {
    // char range lies between 0 to 65,535 (inclusive).
    // size = 2 bytes -> its use 2 bytes coz it follows unicode system not ASCII code system
    char c; 
    Scanner s = new Scanner(System.in);

    System.out.println("ENter character :");
    c = s.next().charAt(0);
    System.out.println("Character is : "+c);

    s.close();



  }
  
}
