import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan = new Scanner(System.in);
    String str1 = scan.nextLine();
    StringBuilder sb1 = new StringBuilder(str1);
    int sb1_len = sb1.length();
    String str2 = scan.nextLine();
    int str2_len = str2.length();
    for (int i=0; i<str2_len; i++)
    {
      for (int j=0; j<sb1_len; j++)
      {
        if (str2.charAt(i) == sb1.charAt(j))
        {
          sb1.setCharAt(j,'$');
        }
      }
    }
    for (int i=0; i<sb1_len; i++)
    {
      if (sb1.charAt(i) != '$')
        System.out.print(sb1.charAt(i));
    }
  }
}