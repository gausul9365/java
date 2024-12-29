class Variable {

  String name; // instance variable
  int age;  // instance variable

  // instance variable ko parameter ki tarah pass nhi krte jaise local variable k sath hota hai ise directly access kiya jata hai jaise ki below code me hua hai 

  // constructor----> jb object create ho jata hai to use initialize krne ka kaam constructor krta h
  Variable(String name, int age){
    this.name = name;
    this.age = age;
  }

  void display(){
    System.out.println("Name: "+name);
    System.out.println("Age: "+age);
  }

}

public class InstanceVariable{

  public static void main(String[] args) {

    Variable v1 = new Variable("G W",21);
    Variable v2 = new Variable("T S",21);

    v1.display();
    v2.display();


  }
}

// jaruri nhi ki constructor create kren tabhi object call hoga , agr hm constructor naa bhi banaye to bhi execute ho jata hai qki compile by default constructor create kr leta hai 