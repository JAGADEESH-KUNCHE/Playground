import java.util.Scanner;
class Main{
    public static void main(String args[]) {
        // Type your code here
      Scanner scan = new Scanner(System.in);
      String str = scan.nextLine();
      int str_len = str.length();
      StringBuilder sb = new StringBuilder(str);
      StringBuilder temp = new StringBuilder(str);
      int ind = str_len-1;
      for (int i=0; i<str_len/2; i++)
      {
        char ch = sb.charAt(i);
        char ch1 = sb.charAt(ind);
        sb.setCharAt(i, ch1);
        sb.setCharAt(ind, ch);
        ind--;
      }
      if (str.contains(sb))
        System.out.print("Yes");
      else
        System.out.println("No");
    } 
}