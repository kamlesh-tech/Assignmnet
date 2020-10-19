package CoreJava2;
import java.util.*;
class Q2
{
    public static void main(String args[])
    {
      Scanner dc = new Scanner (System.in);
      System.out.print("Enter a Number : ");
      int x = dc.nextInt();
      for (int i=1;i<=10;i++)
      {
          System.out.println(x+" x "+i+" = "+x*i);
      }
    }
}