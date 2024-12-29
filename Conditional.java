public class Conditional {
  public static void main(String[] args) {
    int x = 10;
    int y = 20;
    int z = 30;

    if(x>y){
     if(x>z){
      System.out.println("x is greater than y and z");
     }
     else{
      System.out.println("x is greater than y but not z");
     }
    }
    else if (y>z) {
      if(y>x){
        System.out.println("y is greater than x and z");
      }
      else{
        System.out.println("y is greater than x but not z");
      }
    }
    else if (z>x) {
      if(z>y){
        System.out.println("z is greater than x and y");
      }
      else{
        System.out.println("z is greater than x but not y");
      }
    }

    
  }
}
