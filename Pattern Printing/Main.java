import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
       //Try your code here
      Scanner in = new Scanner(System.in);
      int row = in.nextInt();
      int column = in.nextInt();
      for (int i = 1; i <= row; i++)
      {
        int count = row;
        for (int j = 1; j <= column; j++)
        {
          if (j >= i)
            System.out.print(row+1-i);
          else
            System.out.print(count);
          count--;
        }
        System.out.println();
      }
    }
}