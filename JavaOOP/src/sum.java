import java.util.Scanner;
public class sum{
    
    static int sumofNonPrimeIndex(int a[],int b)
    {
        int count = 0;
        int sum1=0;
        for(int i=2;i<b;i++)
        {
            for(int j=2;j<i;j++)
            {
                if(i%j==0)
                count++;
            }
            if(count==0)
            sum1+=a[i];
        }
        return sum1;
        
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int b=sc.nextInt();
        int a[]=new int[b];
        for(int i=0;i<b;i++)
        {
            a[i]=sc.nextInt();
            
        }
        
        System.out.print(sumofNonPrimeIndex(a,b));
        
    }
}