package CoreJava2;
import java.util.*;
class Q4
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Initial number: ");
       int x= sc.nextInt();
       System.out.print("Enter the Ending number: ");
       int y= sc.nextInt();
       
       for (int i=x;i<y;i=i +10)
       {
         
         System.out.print(i+" + ");
       }
      }
}
