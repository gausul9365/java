
class InnerPolimorphism {
//  method overloading <-- compile time polymorphism
  void sum(int a, int b){
    int summ = a +b;
    System.out.println(summ);
  }
  void sum(int a, int b, int c){
    int summ = a +b + c;
    System.out.println(summ);
  }
  void sum(int a){
    System.out.println(a);
    
  }
  
}

public class Polimorphism {

public static void main(String[] args) {
  InnerPolimorphism i = new InnerPolimorphism();
  i.sum(65);
  i.sum(1, 2, 3);
  i.sum(1,2);
  

}
}