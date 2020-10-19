package CoreJava2;
import java.util.*;
class Q3
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the NUmber: ");
        int x = sc.nextInt();
        int temp=0;
        for (int i=2;i<x;i++)
        {
            if (x%i == 0)
           temp = temp +1;
        }
        if (temp==0)
        {
            System.out.println(x+" is prime number");
        }
        else
        {
            System.out.println(x+" is not prime number.");
        }
    }
}