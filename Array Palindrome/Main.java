import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for (int ind=0; ind<arr_size; ind++)
        arr[ind] = in.nextInt();
      int left = 0;
      int right = arr_size-1;
      int sum =0;
      while (left < right)
      {
        if (arr[left] != arr[right])
        {
          System.out.print("No");
          sum++;
          break;
        }
        left++;
        right--;
      }
      if (sum == 0)
        System.out.print("Yes");
    }
}