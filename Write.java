
import java.io.FileWriter;
import java.io.IOException;


public class Write{
  public static void main(String[] args) {
      try{
        FileWriter writer = new FileWriter("data.txt", false);
        writer.write("this is Gausul Wara Imam\n");
       
        writer.close();
        System.out.println("Data has been written to the file.");
     }

     catch(IOException e){
      System.out.println("An error occurred while writing to the file.");
      e.printStackTrace();
     }

    }
  }