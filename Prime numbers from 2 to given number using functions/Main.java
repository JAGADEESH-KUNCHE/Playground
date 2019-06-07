import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      for (int i=2; i<=n; i++)
      {
        int sum= is_prime_num(i);
        if (sum == 1)
          System.out.println(i);
      }
	}
  public static int is_prime_num(int num)
  {
    int count = 0;
    for (int i=1; i<=num/2; i++)
    {
      if (num % i == 0)
      {
        count = count + 1;
      }
    }
    return count;
  }
}