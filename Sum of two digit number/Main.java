import java.util.*;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner in = new Scanner(System.in);
      int N= in.nextInt();
      int n1= N/10;
      int n2= N%10;
      int sum= n1+n2;
      System.out.println(sum);
	}
}