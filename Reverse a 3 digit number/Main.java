import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner in = new Scanner(System.in);
      int l= in.nextInt();
      int n1= l%10;
      int n3= l/100;
      int n= l%100;
      int n2= n/10;
      int num= n1*100+n2*10+n3;
      System.out.println(num);
  }
}