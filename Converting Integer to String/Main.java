import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // type your code 
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int num = n;
    StringBuilder sb = new StringBuilder("");
    if (n < 0)
      n = -(n);
    while (n > 0)
    {
      int r = n % 10;
      char ch = (char) (r + '0');
      sb = sb.append(ch);
      n = n / 10;
    }
    if (num < 0)
    {
      sb = sb.append('-');
    }
    sb.reverse();
    System.out.print(sb);
  }
}