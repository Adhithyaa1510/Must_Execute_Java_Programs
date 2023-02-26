import java.util.Scanner;

public class sample3 {
    public static void main(String args[])
    {
        int i,n,flag=0;
        System.out.println("Enter a Number");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        for(i=2; i<=n/2; i++)
        {
            if(n%i==0)
            {
                flag=1;
            }
            else {flag=0;}
        }
        if(flag==1)
        {System.out.println("It is not prime");}
        else{ System.out.println("It is a prime");}
    }
}
