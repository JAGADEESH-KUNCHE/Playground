import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
      Scanner in = new Scanner(System.in);
      int n= in.nextInt();
      int temp=1;
      for (int i=1; temp<=n; i=i+1)
      {
        if (i %2 != 0)
        {
          System.out.println(i);
          temp = temp +1;
        }
      }
	}
}