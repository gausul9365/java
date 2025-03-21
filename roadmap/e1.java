class e1 {      
  int id;      
  String name;      
  float salary;      
  void insert(int i, String n, float s) {      
      id = i;      
      name = n;      
      salary = s;      
  }      
  void display() {
      System.out.println(id + " " + name + " " + salary);
  }      
}      

class Main {      
  public static void main(String[] args) {      
      e1 e11 = new e1();      
      e1 e2 = new e1();      
      e1 e3 = new e1();      
      e11.insert(101, "ajeet", 45000);      
      e2.insert(102, "irfan", 25000);      
      e3.insert(103, "nakul", 55000);      
      e11.display();      
      e2.display();      
      e3.display();      
  }      
}