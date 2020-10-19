package CoreJava1;
import java.util.*;
class Q13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three Number : ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if (x>y && x>z)
        {
            System.out.println(x+ " is Largest No.");
        }
        else if (y>x && y>z)
        {
         System.out.println(y+ " is Largest No.");   
        }
        else
        {
            System.out.println(z+ " is Largest No.");
        }
    }
}