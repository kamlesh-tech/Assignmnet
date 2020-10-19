package CoreJava2;
import java.util.*;
class Q7
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter size of array");
        int size=sc.nextInt();
      
        int arr[]= new int [size];
        System.out.println("Enter the value in array.");
        for (int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("Print array value");
        for (int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println("Decending order.");
        for (int i=0;i<arr.length;i++)
        {
            int temp = 0;
            for (int j=i+1;j<arr.length;j++)
            {
                if (arr[i] < arr[j]) // Desinding mening largest to small
                {
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int k=0;k<arr.length;k++)
        System.out.println(arr[k]);
        
    }
}