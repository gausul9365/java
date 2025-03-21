public class Array {
  public static void main(String[] args) {
    int s[] =  new int[5];
    int j = 5;
    for(int i=0; i<s.length; i++){
      s[i] = j +2;
    }
    
    for(int i =0; i<s.length; i++){
      System.out.println(s[i]);
    }
    System.out.println("--------for each--------");
    
    for(int i : s){
      System.out.println(i);
    }
    
    



    
  }
  
  
}
