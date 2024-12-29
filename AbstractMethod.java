

abstract  class Animal{

  abstract void sound();

  void sleep(){
    System.out.println("heyy im sleeping...");  //concreate method
  }
}

class cat extends Animal {

  void sound(){
    System.out.println("meow");
  }
}
  
class dog extends Animal{
  void sound(){
    System.out.println("bhokta reh ");
  }
}



public class AbstractMethod {
  
  public static void main(String[] args) {
    
   // Animal a = new Animal(); // WE CANT CREATE OBJECT OF THE ABSTRACT CLASS
   cat c = new cat();
   dog d = new dog();

   c.sound();
   d.sound();

  }
  
}
