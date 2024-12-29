
class College {

  void section_B(){
    System.out.println("hello fariya...");
  }
  void section_C(){
    System.out.println("hello fariya....");
  }
  void section_D(){
    System.out.println("hello fariya....");
  }
  void section_BR(){
    System.out.println("hello fariya.....");
  }
  void section_BT(){
    System.out.println("hello fariya..........");
  }
  void section_BU(){
    System.out.println("hello fariya...");
  }
  void section_W(){
    System.out.println("hello fariya..");
  }
  void section_BP(){
    System.out.println("hello fariya.");
  }

}

class Institute extends College{

  void section_B(){
    System.out.println("hello Tanzeela...");
  } 
  void section_BT(){
    System.out.println("hello");
  }
  
}

public class MethodOveriding {
  public static void main(String[] args) {

    Institute i =  new Institute();

    i.section_B();
    i.section_BT();
    
  }
}
