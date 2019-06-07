import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    // Type your code here
    Scanner in = new Scanner(System.in);
    String string = in.nextLine();
    StringBuilder str = new StringBuilder(string);
    int str_len = str.length();
    int key = in.nextInt();
    for (int i=0; i<str_len; i++)
    {
      char ch = str.charAt(i);
      if (ch >= 'a' && ch <= 'z')
      {
        int offset = ch - key;
        if (offset < 97)
          ch = (char) (offset + 26);
        else
          ch = (char) (offset);
        System.out.print(ch);
      }
      else if (ch >= 'A' && ch <= 'Z')
      {
        int offset = ch - key;
        if (offset < 65 )
          ch = (char) (offset + 26);
        else
          ch = (char) (offset);
        System.out.print(ch);
      }
      else
        System.out.print(ch);
    }
  }
}