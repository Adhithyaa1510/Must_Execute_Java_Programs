class box
{
    double width;
    double height;
    double depth;
}
class simple_class_and_object_program
{
    public static void main(String args[])
    {
        box objectbox=new box();
        double vol;
        objectbox.width=10;
        objectbox.height=10;
        objectbox.depth=15;
        vol=objectbox.width*objectbox.height*objectbox.depth;
        System.out.println("volume is" +vol);
    }
}