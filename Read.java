
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Read {
  public static void main(String[] args) {
  try {
    BufferedReader reader = new BufferedReader(new FileReader("data.txt"));
    String line ;   

    while((line=reader.readLine())!=null){
      System.out.println(line); // Print each line
    }
    reader.close(); // Close the BufferedReader
  // Close the BufferedReader
  } catch (IOException e) {
    System.out.println("💥 Error reading the file!");
  
  }
   
  }
  
}