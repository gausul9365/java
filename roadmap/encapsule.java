class BankAccount {
  private int Balance;

  public BankAccount(int init_Balance){
    if(init_Balance > 0){
      Balance = init_Balance;
     
    }
    this.Balance = init_Balance;
  }

  public void deposit(int amount){
    this.Balance += amount;
    System.out.println("Deposited: " + amount);
    System.out.println("Current Balance: " + this.Balance);
  }

  public void withdraw(int amount){
    if(this.Balance >= amount){
      this.Balance -= amount;
      System.out.println("Withdrawn: " + amount);
      System.out.println("Current Balance: " + this.Balance);
    } else {
      System.out.println("Insufficient Balance");
    }
  }
}

public class encapsule {
  public static void main(String[] args) {
    BankAccount b = new BankAccount(500);
    b.deposit(100);
    b.withdraw(50);


  }
}
