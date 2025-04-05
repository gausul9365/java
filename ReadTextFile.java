
import java.io.File;


public class ReadTextFile {
    public static void main(String[] args) {

        File file = new File("data.txt");

    if (file.exists()) {
    System.out.println("Name: " + file.getName());
    System.out.println("Absolute path: " + file.getAbsolutePath());
    System.out.println("Writable: " + file.canWrite());
    System.out.println("Readable: " + file.canRead());
    System.out.println("File size: " + file.length());
}

    }
}
