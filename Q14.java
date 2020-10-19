package CoreJava1;
import java.util.*;
class Q14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int x = sc.nextInt();
        if ((x%400==0)||(x%4==0 && x%100!=0))
        {
            System.out.println(x+" is leap year");
        }
        else
        {
            System.out.println(x+" is not a leap year.");
        }
    }
}