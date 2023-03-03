class box1{
    double height;  
    double width;
    double length;
    double compute_volume(double height,double width,double length)
    {
        double volume=height*width*length;
        return volume;
        ////System.out.println(volume);
    }
}

public class accessing_member_functions {
    public static void main(String args[])
    {
        box1 objectbox=new box1();
        ////box1 objectbox1=new box1();
        double vol;
        objectbox.height=5;
        objectbox.width=10;
        objectbox.length=35;
        //objectbox.compute_volume();
        vol=objectbox.compute_volume(objectbox.height,objectbox.width,objectbox.length);
        System.out.println(vol);

    }
}
