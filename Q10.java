package CoreJava2;
import java.util.*;
class Q10
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Size of array.");
        int size = sc.nextInt();
        int arr[]=new int [size];
        System.out.println("Enter the Value in array.");
        for (int i=0;i<arr.length;i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum=0;
            int sum1=0;
        System.out.println("Print the Value in array.");
        for (int i= 0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
            if (arr[i]%2==0)
            {
               sum = sum+arr[i]; 
            }
            else{
                sum1= sum1+arr[i];
            }
        }
        System.out.println("The sum of even no is "+sum);
            System.out.println("The sum of odd no is "+sum1);
       

        }
    }
