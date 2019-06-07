import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    int list[] = new int[n];
    for (int ind=0; ind<n; ind++)
      list[ind] = in.nextInt();
    int temp = 0;
    int flag = 0;
    for (int i=0; i<1; i++)
    {
      for (int j=0; j<n; j++)
      {
        if (list[i] < list[j])
        {
          temp = j;
          flag = list[i];
          list[i] = list[j];
          list[j] = flag;
        }
      }
    }
    System.out.print(temp);
  }
}