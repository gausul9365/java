// Import the package
import mypackage.Calculator;

public class TestPackage {
    public static void main(String[] args) {
        
        Calculator cal = new Calculator();
        
        int sum = cal.add(10,20);
        System.out.println(sum);

        int sub = cal.subtract(50,39);
        System.out.println(sub);
    }
}
