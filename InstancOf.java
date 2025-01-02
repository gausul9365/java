
class Animal {
  void A() {
    System.out.println("Animal");
  }
}



public  class InstancOf {
  public static void main(String[] args) {
    Animal a = new Animal();

    System.err.println("a instanceof Animal: " + (a instanceof Animal));
    a.A();
  }
}