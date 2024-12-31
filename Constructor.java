class Name{
  int id;
  String name;

  void display(){
    System.out.println(id + " " + name);

  }  
}

// yha pe koi constructor define nhi kiya gya hai but compiler automatically creates default constructor 
// default constructor 0 aur null value provide krne k liye diye jaate hai


public class Constructor {
  public static void main(String[] args) {
     Name name = new Name();

     name.display();
  }
}
