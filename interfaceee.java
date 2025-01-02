
interface Binary{
    void binary();
    void decimal();
    void Float();

}

class Byteboy implements Binary{
    public void binary(){
        System.out.println("Binary: 1010");
    }
    public void decimal(){
        System.out.println("Decimal: 10");
    }
    public void Float(){
        System.out.println("Float: 10.0");
    }
    
}
class Floatboy implements Binary{
    public void binary(){
        System.out.println("sedfgvhbjn");
    }
    public void decimal(){
        System.out.println("fgvhbjn");
    }
    
    public void Float(){
        System.out.println("asdxfcgvhbj");
    }
}

public class interfaceee{
    public static void main(String[] args) {
        Binary b = new Byteboy();
        b.binary();
        b.decimal();
        b.Float();
        b = new Floatboy();
        b.binary();
        b.decimal();
        b.Float();
    }
}


