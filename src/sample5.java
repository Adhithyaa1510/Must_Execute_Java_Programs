import java.util.Scanner;

public class sample5 {
    public static void main(String args[])
    {  int i=0;
       char a[]=new char[30];
       char b[]=new char[30];
       Scanner sc=new Scanner(System.in);
       String name=sc.nextLine();
       for(i=0;i!=(name.length());i++)
       {
         a[i]=name.charAt(i);
       }
       while(b[i++]==a[i++]);
    }
}
