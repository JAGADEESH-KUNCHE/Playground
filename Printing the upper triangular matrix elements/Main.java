import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
  //Try out your code here
    Scanner in = new Scanner(System.in);
    int r = in.nextInt();
    int c = in.nextInt();
    int matrix[][] = new int[r][c];
    for (int i=0; i<r; i++)
    {
      for (int j=0; j<c; j++)
      {
        matrix[i][j] = in.nextInt();
      }
    }
    display_matrix(matrix);
  }
  public static void display_matrix(int matrix[][])
  {
    for (int i=0; i<matrix.length; i++)
    {
      for (int j=0; j<matrix[i].length; j++)
      {
        if ( i == j)
          System.out.print(matrix[i][j] + " ");
      }
    }
    for (int i=0; i<matrix.length; i++)
    {
      for (int j=matrix[i].length-1; j>=0; j--)
      {
        if ( j < i)
          System.out.print(matrix[j][i] + " ");
      }
    }
  }
}