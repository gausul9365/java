class Over {

  int id;
  int age;
  Over(){
    System.out.println("efault Constructor");

  }

  Over(int i, int j){
    id = i;
    age = j;
  }

  void display(){
    System.out.println(id + " " + age);
}
}

public class ConsOver {

  public static void main(String[] args) {
    Over o = new Over();
    Over o1 = new Over();
  
    o1.display(); 
    
  }
  
}
