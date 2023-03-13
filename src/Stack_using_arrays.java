import java.util.Scanner;

class Stack{
   int count=0;
   double a[]=new double[50];
   double top=a[49];
   double bottom=a[0];
   void push()
   {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the number to push");
    int push_element=sc.nextInt();
    if(count<50)
    {
        a[count]=push_element;
        ++count;
    }
    else
    {
        System.out.println("The Stack is overflow"); 
    }
    void pull()
   {
    if(count>=0)
    {   int pull_element=a[count]
        System.out.println("the element is" + pull_element);
        a[count]="\0";
    }
    else
    {
        System.out.println("The Stack is overflow"); 
    }
   }
}

public class Stack_using_arrays {
    public static void main(String args[])
    {
        Stack mystack1= new Stack();
        mystack1.push();


    }
}
