import java.util.Scanner;

public class sample1 {
    public static void main(String args[])
    {
        int sum=0,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        for(i=0;i<=n;i++)
        {
            sum=sum+(i*i);
        }
        System.out.println("The result is"+ sum);
    }
}
