public class forLoops {
  public static void main(String[] args) {
    int  num = 6;
    int arr[] = {1,2,3,4,5};
    for (int i = 1; i < num; i++) {

      for(int j = 0; j<i; j++){

        System.out.println((i+1)+" mango");

      }
      System.out.println();
    }
    // for each loops
    for(int a : arr){
      System.out.println(a);
    }
  }
  
}
