import java.util.Scanner;
class Box 
{
    double length,height,depth;
    Box(double l,double h, double d)
    {
        length=l;
        height=h;
        depth=d;
    }
    double volume()
    {
        return length*height*depth;
    }
}
class boxexecute
{    public static void main(String[] args)
    {
        double l,h,d,vol;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length,height and depth of the box: ");
        l=sc.nextDouble();
        h=sc.nextDouble();
        d=sc.nextDouble();
        Box b=new Box(l,h,d);
        System.out.println("The volume of the given box is: ");
        vol=b.volume();  
        System.out.println(vol);

    }
}