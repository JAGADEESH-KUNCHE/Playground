import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int[] arr = new int[n];
    for (int i=0; i<n; i++)
      arr[i] = in.nextInt();
    for (int i=0; i<n-1; i++)
    {
      int temp = 0;
      for (int j=i+1; j<n; j++)
      {
        if (arr[i] < arr[j] && arr[j] > temp)
        {
          System.out.println(arr[i] + "," + arr[j]);
          temp = arr[j];
        }
      }
    }
  }
}