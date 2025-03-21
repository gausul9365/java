class clas {
  
  int len;
  int wid;

  void insert(int l, int w){
    len = l ;
    wid = w;
  }

  void result(){
    System.out.println(len*wid);

  }

  
}

public class Main {
  public static void main(String[] args) {
    clas c = new clas();
    c.insert(5, 10);
    c.result();
    c.insert(5, 100);
    c.result();
    
  }
}
