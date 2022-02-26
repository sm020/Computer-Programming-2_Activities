package RemovingWhiteSpaceFromAString;

public class RemovingWhiteSpaceFromAString {

  public static void main(String[] args) {
  
      String str = " S U C C E S S ";
    
      str = str.replaceAll("\\s", ""); 

        System.out.println(str); 
   
  }
}
