package CoreJava2;
import java.util.*;
class Q22
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the no = ");
        int number = sc.nextInt();
        int remainder,reverse=0;
        for (;number !=0;number=number/10)
        {
            remainder=number%10;
            reverse= reverse*10+remainder;
        }
        System.out.println("The everse no is = "+reverse);
    }
}