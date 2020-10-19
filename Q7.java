package CoreJava1;
import java.util.*;
class Q7
{
    public static void main(String args[])
    {
        System.out.println("Enter Obtain mark out off 100.");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr your obtain marks in Hindi = ");
        float Hindi = sc.nextFloat();
        System.out.print("Enetr your obtain marks in English = ");
        float English = sc.nextFloat();
        System.out.print("Enetr your obtain marks in Marathi = ");
        float Marathi = sc.nextFloat();
        System.out.print("Enetr your obtain marks in Science = ");
        float Science = sc.nextFloat();
        System.out.print("Enetr your obtain marks in SocailScience = ");
        float SocailScience = sc.nextFloat();
        float Total_marks=Hindi+English+Marathi+Science+SocailScience; 
        float Percentage= (Total_marks/500)*100;
        System.out.println("Percentage : "+Percentage);
    }
}