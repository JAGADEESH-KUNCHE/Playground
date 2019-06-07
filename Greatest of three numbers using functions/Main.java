import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
      int n1= in.nextInt();
      int n2= in.nextInt();
      int n3= in.nextInt();
      int large = greatest_of_two_num(n1, n2);
      System.out.println(greatest_of_two_num(n3,greatest_of_two_num(n1,n2)));
	}
  public static int greatest_of_two_num(int x, int y)
  {
    if ( x > y)
      return x;
    else
      return y;
  }
}