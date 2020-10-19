package CoreJava1;
import java.util.*;
class Q10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("the temp in Ferenheit is :");
        float temp= sc.nextFloat();
         float c = 5*(temp-32)/9 ;   
         System.out.println("The temp in Celcius is "+ c);
    }
}