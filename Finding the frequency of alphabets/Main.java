import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Try out your code here
    Scanner scan = new Scanner(System.in);
    String sb = scan.nextLine();
    StringBuilder str1 = new StringBuilder(sb);
    int str1_len = str1.length();
    int arr[] = new int[26];
    for (int i=0; i<26; i++)
      arr[i] = 0;
    for (int i=0; i<str1_len; i++)
    {
      if(str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
      {
        int offset = str1.charAt(i) - 'a';
        arr[offset]++;
      }
      else if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
      {
        int offset = str1.charAt(i) - 'A';
        arr[offset]++;
      }
    }
    for (int i=0; i<str1_len; i++)
    {
      if(str1.charAt(i) >= 'a' && str1.charAt(i) <= 'z')
      {
        int offset = str1.charAt(i) - 'a';
        if (arr[offset] != 0)
        {
          System.out.print(str1.charAt(i));
          System.out.print(arr[offset]);
          System.out.print(" ");
          arr[offset] = 0;
        }
      }
      else if (str1.charAt(i) >= 'A' && str1.charAt(i) <= 'Z')
      {
        int offset = str1.charAt(i) - 'A';
        char ch = (char)(offset + 'a');
        str1.setCharAt(i,ch);
        if (arr[offset] != 0)
        {
          System.out.print(str1.charAt(i));
          System.out.print(arr[offset]);
          System.out.print(" ");
          arr[offset] = 0;
        }
      }
    }
  }
}