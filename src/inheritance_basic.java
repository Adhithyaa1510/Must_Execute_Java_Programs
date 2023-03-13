class Parent{
    int i;
    int j;
    void parent_values()
    {
     System.out.println("The values of i and j is " +i + " " +j);
    }
}
class Child extends Parent{
    int k;
    int l;
    void child_values()
    {
     System.out.println("The values of i and j is " +i + " " +j);
     System.out.println("The values of k and l is " +k + " " +l);
    }
    int add()
    {
     return i+j+k+l;
    }
    
}
public class inheritance_basic {
    public static void main(String args[])
    {
        Parent ParentObj=new Parent();
        ParentObj.i=4;
        ParentObj.j=5;
        ParentObj.parent_values();
        Child ChildObj=new Child();
        ChildObj.i=10;
        ChildObj.j=11;
        ChildObj.k=6;
        ChildObj.l=7;
        ChildObj.child_values();
        ParentObj.parent_values();
        int addition=ChildObj.add();
        System.out.println("Addition is " + addition);


    }
}
