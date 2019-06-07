import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    // your code here
    Scanner in = new Scanner(System.in);
    int arr_size = in.nextInt();
    int arr_input[] = new int[arr_size];
    for (int i=0; i<arr_size; i++)
      arr_input[i] = in.nextInt();
    int max = 0;
    int max_idx = 0;
    for (int i=0; i<arr_size; i++)
    {
      int count = 0;
      for (int j=0; j<arr_size; j++)
      {
        if (arr_input[i] == arr_input[j])
        {
          count++;
        }
        if (count > max)
        {
          max = count;
          max_idx = i;
        }
      }
    }
    System.out.print(arr_input[max_idx]);
  }
}