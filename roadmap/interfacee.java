
interface  inter1 {
 
void sound();
void sleep();
}

interface inter2 {
  void sound2();
  void sleep2();
}

class Dog implements inter1, inter2 {
  public void sound(){
    System.out.println("Bark");
  }
  public void sound2(){
    System.out.println("Bark Bark");
  }
  public void sleep(){
    System.out.println("Zzz");
  }
  public void sleep2(){
    System.out.println("Zzz Zzz");
  }
}




public class interfacee {
  public static void main(String[] args) {
    Dog d = new Dog();
    d.sound();
    d.sleep();
    d.sound2();
    d.sleep2();
  }
}
