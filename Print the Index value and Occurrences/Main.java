import java.util.*;
import java.util.regex.*;
import java.io.*;
public class Main {

    public static void main(String[] args) {
       // type your code here
      Scanner in = new Scanner(System.in);
      String patternString = in.nextLine();
      String text = in.nextLine();
      Pattern p = Pattern.compile(patternString);
      Matcher matcher = p.matcher(text);
      int count = 0;
      while(matcher.find())
      {
        count++;
        System.out.println("found: " +count+" : "+matcher.start()+" - "+matcher.end());
        
      }
      if(count == 0)
        System.out.println("The given word is not present in the string");
      else
        System.out.println(count);
    }
}