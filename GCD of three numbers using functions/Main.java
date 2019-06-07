import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int gcd = gcd_of_two_num(n1,n2);
      System.out.println(gcd_of_two_num(gcd,n3));
	}
  public static int gcd_of_two_num(int x, int y)
  {
    int min = 0;
    if (x <= y)
      min = x;
    else
      min = y;
    int count = 0;
    while (count == 1)
    {
      if ((x % min == 0) && (y % min == 0))
        count = 1;
      else
        min--;
    }
    return min;
  }
}