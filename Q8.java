package CoreJava2;
import java.util.*;
class Q8
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Size of Array.");
       int size = sc.nextInt();
       int arr[] = new int[size];
       System.out.println("Enter the array value.");
       for (int i=0;i<arr.length;i++)
       {
           arr[i]= sc.nextInt();
       }
       System.out.println("Print array value");
       for (int i=0;i<arr.length;i++)
       {
           System.out.println(arr[i]);
       }
       System.out.println("Reverse the Array.");
       for (int i=arr.length-1;i>=0;i--)
       {
           System.out.print(arr[i]+" ");
       }
    }
}