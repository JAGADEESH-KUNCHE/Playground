import java.util.Scanner;
class Main{
    public static void main(String args[]) {
       // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for (int ind=0; ind<arr_size; ind++)
        arr[ind] = in.nextInt();
      int count = 0;
      for (int i=0; i<arr_size; i++)
      {
        if (arr[i] == 0)
          count++;
      }
      int n = arr_size-count;
      int list[] = new int[n];
      int flag = 0;
      for (int j=0; j<arr_size; j++)
      {
        if (arr[j] != 0)
        {
          list[flag] = arr[j];
          flag++;
        }
      }
      for (int k=0; k<n; k++)
      {
        System.out.print(list[k]);
        System.out.print(" ");
      }
      for (int m=0; m<count; m++)
      {
        System.out.print("0");
        System.out.print(" ");
      }
    }
}