class Example {
    int a, b;

    
    public Example() {
        this(10, 20); 
        System.out.println("Default Constructor");
    }

    
    public Example(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("Parameterized Constructor: a = " + a + ", b = " + b);
    }
}

public class Chaining {
    public static void main(String[] args) {
        Example obj = new Example();
    }
}
