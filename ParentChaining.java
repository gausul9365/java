class Parent {
   public  Parent() {
        System.out.println("Parent Constructor");
    }
    public Parent(String message) {
      System.out.println("Parent Parameterized Constructor: " + message);
  }
}

class Child extends Parent {
    public Child() {
      this("hello khurram");
        System.out.println("Child Constructor");
    }

    public Child(String message) {
      super("Message to Parent"); // Calls the parameterized constructor of the parent class
      System.out.println("Child Parameterized Constructor: " + message);
  }

}

public class ParentChaining {
    public static void main(String[] args) {
        Child obj = new Child();
    }
  
}
