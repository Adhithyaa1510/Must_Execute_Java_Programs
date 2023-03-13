class box{
    double width;
    double height;
    double length;
    box()
    {
        System.out.println("Constructing Box");
        width=10;
        height=20;
        length=30;
    }
    double volume()
    {
        double volume=length*width*height;
        return volume;
    }
}
public class constructors_java{
  public static void main(String args[])
    {
        box mybox1=new box();
        double objectvolume;
        objectvolume=mybox1.volume();
        System.out.println("volume is " + objectvolume);
    }
}
