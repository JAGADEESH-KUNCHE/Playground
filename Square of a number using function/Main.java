import java.util.Scanner;
class Main
{
    public static int Square_of_num(int num)
    {
      int sum = num * num;
      return sum;
    }
	public static void main (String[] args)
    {
	 // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int no = Square_of_num(n);
      System.out.print(no);
	} 
}