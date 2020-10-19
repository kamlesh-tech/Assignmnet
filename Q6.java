package CoreJava2;
import java.util.*;
class Q6
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner (System.in);
        int arr []= new int[10];
        System.out.println("Enter the value in array.");
        for (int i =0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("show the number in array..");
        int sum =0;
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
            sum= sum+arr[i];
        }
        System.out.println();
        System.out.println("the sum of array is : "+sum);
        float avg =sum/10;
        System.out.println("The Avegrage is "+avg);
        
    }
}