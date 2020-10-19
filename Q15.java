package CoreJava1;
import java.util.*;
class Q15
{
    public static void main(String args[])
    {
           Scanner sc = new Scanner(System.in);
           System.out.print("Enter yor Gender( M / F ): ");
           char Gender = sc.next().charAt(0);
           System.out.print("Enter your Age : ");
           int age = sc.nextInt();
           if ((Gender == 'm'|| Gender == 'M') && (age >=21))
           {
               System.out.println("You are Eligible for Marriage.");
           }
           else if ((Gender == 'f' || Gender == 'F') && (age>=18))
           {
               System.out.println("You are Eligible for Marriage.");
           }
           else
           {
               System.out.println("Beta padai kr le Jr. white hat pe..");
           }
    }
}