//import required packages
import java.util.Scanner;
class Faculty
{
  public void salary(int salary)
  {
    System.out.println("Base Salary: " + salary);
    //write your Faculty class statements
  }
}
class CSE extends Faculty
{
  public void salary(int salary)
  {
    //write your CSE class statements
    System.out.println("CSE Faculty: " + (salary+3000));
  }
}
class IT extends Faculty
{
  public void salary(int salary)
  {
    //write your IT class statements
    System.out.println("IT Faculty: " + (salary+5000));
  }
}
class ECE extends Faculty
{
  public void salary(int salary)
  {
    //write your ECE class statements
    System.out.println("ECE Faculty: " + (salary+4500));
  }
}

class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    int baseSalary = sc.nextInt();
    if (baseSalary > 0)
    {
      Faculty obj = new Faculty();
      obj.salary(baseSalary);
      CSE obj1 = new CSE();
      obj1.salary(baseSalary);
      IT obj2 = new IT();
      obj2.salary(baseSalary);
      ECE obj3 = new ECE();
      obj3.salary(baseSalary);
    }
    //implement your required concept here
      else
      {
        System.out.println("null");
      }
  }
}