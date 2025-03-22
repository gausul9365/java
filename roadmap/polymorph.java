
// polymprphism works with two things
// 1. method overriding
// 2. method overloading

// this program focuses on method overloading

class BankAccount {
  public void display() {
    System.out.println("Account balance is 0");
  }
  
  public void display(int balance) {
    System.out.println("Account balance is " + balance);
  }
}
 

public class polymorph {
  public static void main(String[] args) {
    BankAccount b = new BankAccount();
    b.display();
    b.display(250);
  }
  
}
