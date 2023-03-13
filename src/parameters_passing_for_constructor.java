class box2{
    double width;
    double height;
    double length;
    box2(double w,double h,double l)
    {
        System.out.println("Constructing Box");
        width=w;
        height=h;
        length=l;
    }
    double volume()
    {
        double volume=length*width*height;
        return volume;
    }
}
public class parameters_passing_for_constructor{
    public static void main(String args[])
    {
        box2 mybox2=new box2(10,20,30);
        double objectvolume;
        System.out.println("Constructing Box");
        objectvolume=mybox2.volume();
        System.out.println("volume is " + objectvolume);
    }
}
