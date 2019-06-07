import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //your code here;
    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    StringBuilder s = new StringBuilder(str);
    int s_len = s.length();
    int start = 0, end = 0;
    int i = 0;
    for (i=0; i<s_len; i++)
    {
      if (s.charAt(i) == ' ')
      {
        end = i-1;
        reverse_word(s, end, start);
        start = end+2;
      }
    }
    if (i == s_len)
    {
      end = i-1;
      reverse_word(s, end, start);
    }
    System.out.print(s);
  }
  public static void reverse_word(StringBuilder s, int end, int start)
  {
    int front = start;
    while(front < end)
    {
      char tmp_ch = s.charAt(front);
      s.setCharAt(front, s.charAt(end));
      s.setCharAt(end, tmp_ch);
      front++;
      end--;
    }
  }
}