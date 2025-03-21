public class stringLearn {
  public static void main(String[] args) {
    String str = "Hello, World!"; // string
    String add = str + " I am learning Java"; // concatenation
    
    
    System.out.println(str);
    System.out.println(add);
    System.out.println(add.length());

    StringBuffer sb = new StringBuffer("tanzeela "); // mutable string
    sb.append("Hello, World!");
    System.out.println(sb);
    sb.insert(5, " Java");  // (5,"java")  
    System.out.println(sb);
    sb.delete(5, 10);  
    System.out.println("After delete: " + sb);

  }
}
