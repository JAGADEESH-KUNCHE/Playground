import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   // Type your code here
      Scanner in = new Scanner(System.in);
      int num= in.nextInt();
      int total=0;
      int n = num;
      while (num > 0)
      {
        int sum = 1;
        int r = num % 10;
        while (r >= 1)
        {
        sum = sum * r;
        r = r - 1;
        }
        total = total + sum;
        num = num / 10;
      }
      if (total == n)
        System.out.println("Yes");
      else
        System.out.println("No");
	}
}