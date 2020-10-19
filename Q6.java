package CoreJava1;
import java.util.*;
import java.lang.*;
class Q6
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Radius of Circle: ");
        float x = sc.nextFloat();
        double Area=3.14*((float)Math.pow(x,2));
        float circumference = (float)(2*3.14*x);
        System.out.println("Area of Cirle is : "+Area);
        System.out.println("Circumference of circle is = "+circumference);
        
    }
}