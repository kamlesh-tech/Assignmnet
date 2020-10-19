package CoreJava1;
import java.util.*;
class Q12
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the basic Salaray : ");
        float Basic= sc.nextFloat();
        float HRA=0;
        double DA=0;
        if (Basic<10000)
        {
             HRA= Basic/10;
             DA= Basic*0.90;
        }
        else
        {
           HRA= 2000;
           DA= Basic*0.98; 
        }
        double GS=  Basic + DA + HRA;
        System.out.println("The Gross Salary is "+ GS);
    }    
}