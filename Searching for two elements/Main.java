import java.util.Scanner;
class Main{
    public static void main(String args[]){
        // Type your code here
      Scanner in = new Scanner(System.in);
      int arr_size = in.nextInt();
      int arr[] = new int[arr_size];
      for (int i=0; i<arr_size; i++)
        arr[i] = in.nextInt();
      int search_elem_1 = in.nextInt();
      int search_elem_2 = in.nextInt();
      int element_1_index = -1;
      int element_2_index = -1;
      for (int j=0; j<arr_size; j++)
      {
        if (search_elem_1 == arr[j])
        {
          element_1_index = j;
          break;
        }
      }
      for (int k=0; k<arr_size; k++)
      {
        if (search_elem_2 == arr[k])
        {
          element_2_index = k;
          break;
        }
      }
      System.out.println(element_1_index);
      System.out.println(element_2_index);
    }
}