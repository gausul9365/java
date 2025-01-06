
import java.util.Scanner;

class Innerencapsule {
  private String str = "meeting at 10:00";
  
  public String getStr() {
    return str;
  }

  public String setStr(String newStr) {


    this.str = newStr;
    return str;
  }


}



public class encapsule {
  public static void main(String[] args) {
  
    Innerencapsule obj = new Innerencapsule();
    System.out.println(obj.getStr());
    
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the new string: ");
    String newStr = sc.nextLine();  
    obj.setStr(newStr);
    sc.close(); 

    System.out.println(obj.getStr());
    
    

  }
}
