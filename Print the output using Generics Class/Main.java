import java.util.*;
public class Main<T> 
{ 
  // type your code here
  private T t;
  public void insert(T t)
  {
    this.t = t;
  }
  public T get()
  {
    return t;
  }
  public static void main(String[] args) 
     { 
       // type your code here
       Scanner in = new Scanner(System.in);
        Main<Integer> iobj =new Main<Integer>();
        int num = in.nextInt();
        iobj.insert(num);
        
        Main<String> sobj = new Main<String>();
        String str = in.next();
        sobj.insert(str);
        
        Main<Float> fobj = new Main<Float>();
        Float flo = in.nextFloat();
        fobj.insert(flo);
        
        System.out.println("Integer Value: " + iobj.get());
        System.out.println("String Value: " + sobj.get());
        System.out.println("Float value: " + fobj.get());
       }
 }