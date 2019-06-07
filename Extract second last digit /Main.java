import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int l= in.nextInt();
      int n1= l%100;
      int n2= n1/10;
      System.out.println(n2);
	}
}