import java.util.Scanner;
class Main{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int sum = sum_n(num);
    System.out.print(sum);
  }
  public static int sum_n(int n)
  {
    if(n == 1)
    {
      return 1;
    }
    else
    {
      return n+sum_n(n-1);
    }
  }
}