import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    	//Try your code here
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr[] = new int[arr_size];
    for (int index=0; index<arr_size; index++)
      arr[index] = in.nextInt();
    int no_of_rotations = in.nextInt();
    rotation_odd_right(arr, arr_size, no_of_rotations);
    rotation_even_left(arr, arr_size, no_of_rotations);
    for (int k=0; k<arr_size; k++)
    {
      System.out.print(arr[k]);
      System.out.print(" ");
    }
  }
  public static void rotation_odd_right(int arr[], int n, int no_of_rotations)
  {
    for (int i=0; i<no_of_rotations; i++)
    {
      int temp = 0;
      if( n % 2 == 0)
      {
        temp = arr[n-2];
        for (int j=n-2; j>1; j=j-2)
        {
          arr[j] = arr[j-2];
        }
        arr[0] = temp;
      }
      else
      {
        temp = arr[n-1];
        for (int k=n-1; k>1; k=k-2)
        {
          arr[k] = arr[k-2];
        }
        arr[0] = temp;
      }
    }
  }
  public static void rotation_even_left(int arr[], int n, int no_of_rotations)
  {
    for (int i=0; i<no_of_rotations; i++)
    {
      int temp = arr[1];
      for (int j=1; j<n-2; j=j+2)
      {
        arr[j] = arr[j+2];
      }
      if (n % 2 == 0)
        arr[n-1] = temp;
      else
        arr[n-2] = temp;
    }
  }
}