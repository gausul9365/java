
class Mini {
   static void min(int a[]){
    int min = a[0];
    for(int i =1; i<a.length; i++){
      if(a[i]<min){
        min = a[i];
      }
    }
    System.out.println(min);

  }
}

public class minimum{
  public static void main(String[] args) {
    int[] arr = {10, 20, 30, 40, 50};
    Mini.min(arr);
   

  }
}