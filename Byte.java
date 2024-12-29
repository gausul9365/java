import java.util.Scanner;

public class Byte {

  public static void main(String[] args) {
    byte num1;     // = 127;  //The byte range lies between -128 to 127 (inclusive). cant take more than 127
    byte num2;     //  = -128;

    Scanner s = new Scanner(System.in);
    System.out.println("Enter a number");
    num1 = s.nextByte();
    
    System.out.println("Enter a number");
    num2 = s.nextByte();




    System.out.println("sum =" + (num1 + num2));
    System.out.println("sub =" + (num1 - num2));

    s.close();
  }
}

