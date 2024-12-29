class InnerConstructorOvrl {

  void display(int a){
    System.out.println(a);

  }

  int display(String a){
    System.out.println("2");
    return 0;
  }
}

public class ConstructorOvrl {
  public static void main(String[] args) {
    InnerConstructorOvrl obj = new InnerConstructorOvrl();
    obj.display(10);
    obj.display("Narendra");
  }
  
}
