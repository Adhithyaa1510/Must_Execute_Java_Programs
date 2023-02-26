import java.util.Scanner;

public class sample2 {
    public static void main(String args[])
    {
        int count=0,digit;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int number=sc.nextInt();
        int arrayofdigits[];
        arrayofdigits=new int[50];
        for(int i=0; number>0; i++)
        {
            digit=number%10;
            arrayofdigits[i]=digit;
            number=number/10;
            count++;
        }
        int result=((arrayofdigits[1]*arrayofdigits[1])+(arrayofdigits[count-2]*arrayofdigits[count-2]));
        System.out.println("Result is"+ result);
    }
}
