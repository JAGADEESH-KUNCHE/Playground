import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //type your code here
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    int str_len = str.length();
    double aftdec = 0;
    double befdec = 0;
    int flag = 0;
    for (int i=0; i<str_len; i++)
    {
      if (str.charAt(i) == '.')
        flag = 1;
    }
    if (flag == 1)
    {
      for (int i=str_len-1; str.charAt(i) != '.' && i>=0; i--)
      {
        aftdec = aftdec/10 + (str.charAt(i) - '0');
      }
      aftdec = aftdec/10;
      for (int k=0; str.charAt(k)!='.'; k++)
      {
        befdec = befdec * 10 + (str.charAt(k) - '0');
      }
    }
    else
    {
      for (int j=0; j<str_len; j++)
      {
        befdec = befdec * 10 + (str.charAt(j) - '0');
      }
    }
      double sum = befdec + aftdec;
      System.out.printf("%.6f",sum);
  }
}