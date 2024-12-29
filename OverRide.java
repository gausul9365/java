
class RBI {

 
   void rateOfInterest(){

  System.out.println("Rate of interest nhi hona chahiye");

 }
}

class Axis extends RBI {
  void rateOfInterest(){

    System.out.println("Rate of interest 10 hona chahiye");
   
   }
}

class CBI extends RBI{
  void rateOfInterest(){

    System.out.println("Rate of interest 4 hona chahiye");
  
   }

}
class SBI extends RBI{
  void rateOfInterest(){

    System.out.println("Rate of interest 11 hona chahiye");
  
   }
}


public class OverRide {
  public static void main(String[] args) {

    SBI sbi = new SBI();
    sbi.rateOfInterest();
    
    Axis axis = new Axis();
    axis.rateOfInterest();
  }
  
}
