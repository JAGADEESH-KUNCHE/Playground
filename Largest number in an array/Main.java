import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      int temp = 0;
      for (int i=0; i<arr_size; i++)
        arr[i] = in.nextInt();
      for (int j=0; j<arr_size; j++)
      {
        for (int k=0; k<arr_size; k++)
        {
          if(arr[j] > arr[k])
          {
            temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
          }
        }
      }
      System.out.println(arr[0]);
    }
}