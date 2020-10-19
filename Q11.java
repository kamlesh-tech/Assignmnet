package CoreJava1;
import java.util.*;
class Q11
{
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the First No: ");
       int x = sc.nextInt();
       System.out.print("Enter the Sencond No: ");
       int y = sc.nextInt();
       System.out.println("Before Swapping value us :");
       System.out.println("Value of X is = "+x);
       System.out.println("Value of y is = "+y);
       /*x= x+y;
       y= x-y;
       x=x-y;
       System.out.println("============Number After Swapiing=========="); 
       System.out.println("Value of X is = "+x);
       System.out.println("Value of y is = "+y);
       System.out.println(**********************************************);
       System.out.println();*/
       System.out.println("Swapping using third variable");
       int Third =x;
       x=y;
       y=Third;
       System.out.println("============Number After Swapiing==========");
       System.out.println("Value of X is = "+x);
       System.out.println("Value of y is = "+y);
          
    }
}