import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.io.*;
import java.util.*;
public class Main {
    // type your code here
  private static Pattern uNamePtrn = Pattern.compile("^[a-zA-Z0-9_-]*$");
  public static boolean valUName(String uName){
    Matcher mtch = uNamePtrn.matcher(uName);
    if(mtch.matches()){
      return true;
    }
    return false;
  }
  private static Pattern eIdPtrn = Pattern.compile("^[a-z0-9._@]*$");
  public static boolean valEId(String eId){
    Matcher mtch = eIdPtrn.matcher(eId);
    if(mtch.matches()){
      return true;
    }
    return false;
  }
  private static Pattern pWordPtrn = Pattern.compile("^[a-z0-9._@]*$");
  public static boolean valPWord(String pWord){
    Matcher mtch = pWordPtrn.matcher(pWord);
    if(mtch.matches()){
      return true;
    }
    return false;
  }
  public static void main(String a[]){
      // type your code here
    
    Scanner in = new Scanner(System.in);
    String uName = in.next();
    String eId = in.next();
    String pWord = in.next();
    System.out.println("Is " + uName + " a valid user name? " + valUName(uName));
    System.out.println("Is " + eId + " a valid email address? " + valEId(eId));
    System.out.println("Is " + pWord + " a valid password? " + valPWord(pWord));
    }
}