class Para {
  int id;
  String name;
  float salary;

  Para(int i, String n, float s){
    id = i;
    name = n;
    salary = s;
  }

  void display(){
    System.out.println(id + " " + name + " " + salary);
  }
}

public class ParaCons {
  public static void main(String[] args) {
    Para p = new Para(101, "ajeet", 45000);

    p.display();
  }
}
