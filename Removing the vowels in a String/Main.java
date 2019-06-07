import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int str_len = str.length();
    StringBuilder sb = new StringBuilder("");
    for (int i=0; i<str_len; i++)
    {
      if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
      {
        if (str.charAt(i) != 'a' && str.charAt(i) != 'e' && str.charAt(i) != 'i' && str.charAt(i) != 'o' && str.charAt(i) != 'u')
          sb.append(str.charAt(i));
      }
      else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
      {
        if (str.charAt(i) != 'A' && str.charAt(i) != 'E' && str.charAt(i) != 'I' && str.charAt(i) != 'O' && str.charAt(i) != 'U')
          sb.append(str.charAt(i));
      }
      else if (str.charAt(i) == ' ')
        sb.append(str.charAt(i));
    }
    System.out.print(sb);
  }
}