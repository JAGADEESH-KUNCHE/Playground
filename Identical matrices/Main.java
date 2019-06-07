import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  //Try out your code here
    Scanner in = new Scanner(System.in);
    int row_size = in.nextInt();
    int column_size = in.nextInt();
    int matrix1[][] = new int[row_size][column_size];
    for (int i=0; i<row_size; i++)
    {
      for (int j=0; j<column_size; j++)
      {
        matrix1[i][j] = in.nextInt();
      }
    }
    int matrix2[][] = new int[row_size][column_size];
    for (int i=0; i<row_size; i++)
    {
      for (int j=0; j<column_size; j++)
      {
        matrix2[i][j] = in.nextInt();
      }
    }
    int temp = 1;
    for (int i=0; i<row_size; i++)
    {
      for (int j=0; j<column_size; j++)
      {
        if (matrix1[i][j] != matrix2[i][j])
        {
          System.out.print("No");
          temp = 0;
          break;
        }
      }
      if (temp == 0)
        break;
    }
    if (temp == 1)
    {
      System.out.print("Yes");
    }
  }
}