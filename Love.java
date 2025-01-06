 
 public class Love{
  private String LoveSecrete;

  public String getLoveSecrete(){
    return LoveSecrete;
  }

  public void setLoveSecrete(String newLoveSecrete){
    
    if(newLoveSecrete.contains("Trust") && newLoveSecrete.contains("respect")){
      
      LoveSecrete = newLoveSecrete;
    }
    else{
      System.out.println("I thing u have no respect in love, coz u have no respect and trust");
    }
    
  }
  public static void main(String[] args) {
    Love myLove = new Love();
    System.out.println("My love secrete is: " + myLove.getLoveSecrete());
    myLove.setLoveSecrete("Trust, respect, care");
    System.out.println("My  improved love secrete is: " + myLove.getLoveSecrete());
   
    
    myLove.setLoveSecrete("noStudy, noRespect");
    System.out.println("My  improved love secrete is: " + myLove.getLoveSecrete());
  }

 }

 