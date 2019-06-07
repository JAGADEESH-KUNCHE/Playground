import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      for (int i=1; i<=n; i++)
      {
        int sum = n+1-i;
        for (int j=1; j<=n-i+1; j++)
        {
          System.out.print(sum);
          sum = sum - 1;
        }
        System.out.print("\n");
      }
      }
	}