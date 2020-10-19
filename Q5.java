package CoreJava2;
import java.util.*;
class Q5
{
    public static void main(String rags[])
    {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the first no: ");
        int x = sc.nextInt();
        System.out.print("Enter the Second no: ");
        int y = sc.nextInt();
       /* int i,j;
        //int temp = 0;
        for (i=x;x<y;x++)
        {
            for(j=2;j<x;j++)
                if(x%j==0)
                    break;
             //System.out.print(j+" ");
            
        if (x==j)
            System.out.print(x+" ");
        }*/
       for (int i=x;i<y;i++){
       if (i==1 || i==0)
           continue;
      int flag=0;
       for (int j=2;j<i;j++)
       {
           if(i%j==0)
           {flag=1;
           break;}
       }
       if (flag==0)
           System.out.println(i+" ");
       }
       
}
}