import java.util.Scanner;
public class areaandcircum {
   
    public static void main(String[] args) {
       Scanner obj = new Scanner(System.in);
       System.out.println("Enter the dimensions of the rectangle");
       double l = obj.nextDouble();
       double b = obj.nextDouble();
      System.out.println("The area of the rectangle is "+l*b);
      System.out.println("The circumference of the rectangle is "+ 2*(l+b));
    }
}