import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int base= in.nextInt();
    int exponent= in.nextInt();
    int value= power_of_num(base,exponent);
    System.out.print(value);
  }
  public static int power_of_num(int n1, int n2)
  {
    int sum = 1;
    for (int i=1; i<=n2; i++)
    {
      sum = sum * n1;
    }
    return sum;
  }
}