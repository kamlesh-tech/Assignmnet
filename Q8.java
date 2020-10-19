package CoreJava1;
import java.util.*;
class Q8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Principal : ");
        float principal= sc.nextFloat();
         System.out.println("Rate : ");
        float rate= sc.nextFloat();
         System.out.println("Time : ");
        float time = sc.nextFloat();
        float SI = (principal * rate* time)/100;
        System.out.println(SI);
        
    }
    
}