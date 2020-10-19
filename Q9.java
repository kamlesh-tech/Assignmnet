package CoreJava2;
import java.util.*;
class Q9
{
    public static void main(String args[])
    {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter Size of array : ");
        //int arr == new Sacanner(System.in);
        int size= sc.nextInt();
        int arr[]= new int [size];
        System.out.println("Enter the value in array : ");
        for (int i=0;i<size;i++)
        {
           arr[i]=sc.nextInt();
        }
        System.out.println("Show the value....");
        for(int j=0;j<=arr.length-1;j++)
        {
            System.out.println(arr[j]+" ");
        }
        System.out.println("Enter the searching Number : ");
        int S=sc.nextInt();
        int search=S;
        int count=0;
        int flag=0;
        for (int i=0;i<arr.length;i++)
        {
            if (search==arr[i])
            {
                flag=1;
                count++;
            }
        }
        if (flag==1)
        {
            System.out.println(S+" is Found");
            System.out.println("repatation of number is "+count);
        }
        else
        {
            System.out.println(S+ " Not Found...");
        }
        
    }
}