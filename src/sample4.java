import java.util.Scanner;

public class sample4 {
    public static void main(String args[])
    {
        int a,b;
        Scanner getvalue=new Scanner(System.in);
        a=getvalue.nextInt(); //20
        b=getvalue.nextInt();  //22
        a=b-a; //22-20=2;
        b=b-a; //22-2=20;
        a=b+a; // 20+2=22;
        System.out.println("a is"+ a);
        System.out.println("b is"+ b);
    }
}
