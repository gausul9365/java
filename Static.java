class InnerStatic {
    static int count = 0;
    InnerStatic() {
      count++;
    }

    void display(){
      System.out.println("count : " + count);
    }

  
}

public class Static {
  public static void main(String[] args) {
    InnerStatic i1 = new InnerStatic();
    i1.display();
    InnerStatic i2 = new InnerStatic();
    i2.display();
    InnerStatic i3 = new InnerStatic();
    i3.display();

    System.out.println("final count: " + InnerStatic.count);
  }
  
}

/*
Things to Remember

Access Through Class Name:
Use ClassName.variable to emphasize that the variable belongs to the class. --> jaise line 23 me hua h 

Initialization Happens Once:
Static variables are initialized only once, when the class is loaded into memory.

Shared State:
Be careful when modifying static variables, as changes will affect all instances.
 */

 /*
  * static final
      Constant Values: It’s mainly used to define constants that should not be changed and need to be shared by all instances of the class. A good example is mathematical constants like PI.
  */  