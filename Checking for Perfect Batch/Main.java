import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try your code here
    Scanner in = new Scanner(System.in);
    int n= in.nextInt();
    int list[] = new int[n];
    for (int index=0; index<n; index++)
      list[index] = in.nextInt();
    int batch = n / 3;
    int arr[] = new int[batch];
    for (int i=0; i<batch; i++)
    {
      for (int j=i*3; j<i*3+3; j++)
        arr[i] = arr[i] + list[j];
    }
    int is_match=1;
    for (int k=0; k<batch; k++)
    {
      if(arr[k]!=arr[0])
      {
        is_match=0;
        break;
      }
    }
    if(is_match == 1)
      System.out.print("Perfect Batch");
    else
      System.out.print("Not a Perfect Batch");
  }
}