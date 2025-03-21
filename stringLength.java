






public class stringLength {
  public static void main(String[] args) {
    // String str = "Hello, World!";
    // int n  = str.length();

    // System.out.println("Last character: " + str.charAt(n-1));
    // System.out.println("starting character: " + str.charAt(0));


    String str = "Tanzeela";

      int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == 'a') {
        count++;
        
      }
    }

    System.out.println("Number of a's in the string: " + count);
    
  }
}