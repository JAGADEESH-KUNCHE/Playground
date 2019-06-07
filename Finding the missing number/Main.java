import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int arr[] = new int[n];
      for (int ind=0; ind<n; ind++)
        arr[ind] = in.nextInt();
      for (int i=1; i<=n; i++)
      {
        int find = 0;
        for (int j=0; j<n; j++)
        {
          if (arr[j] == i)
            find++;
        }
        if (find == 0)
        {
          System.out.print(i);
          break;
        }
      }
    }
}