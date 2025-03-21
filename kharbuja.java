interface Innerkharbuja {
  void sound();

  void eat();

}

class I implements Innerkharbuja {
  public void sound() {
      System.out.println("barks");
  }

  public void eat() {
      System.out.println("panner");

  }

}

public class kharbuja {
  public static void main(String[] args) {
      Innerkharbuja buja = new I();
      buja.eat();
      buja.sound();

  }

}