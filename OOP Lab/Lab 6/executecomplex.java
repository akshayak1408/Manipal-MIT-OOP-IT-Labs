import java.util.Scanner;
class complex{
    int real;
    int img;
    void add(int a, complex c){
        real=a+c.real;
        img=c.img;
    }
    void add(complex c1, complex c2){
        real=c1.real+c2.real;
        img=c1.img+c2.img;
    }
    void display(){
        System.out.println(real+"+i"+img);
    }    
}
public class executecomplex{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        complex a=new complex();
        complex b=new complex();
        System.out.print("Enter real and imaginary part for first complex number: ");
        a.real=sc.nextInt();
        a.img=sc.nextInt();
        System.out.print("Enter real and imaginary part for second complex number: ");
        b.real=sc.nextInt();
        b.img=sc.nextInt();
        int m;
        System.out.print("Enter integer to add with complex: ");
        m=sc.nextInt();
        complex k=new complex();
        System.out.print("Integer added with a complex number: ");
        k.add(m,a);
        k.display();
        System.out.print("Both complex numbers added together: ");
        k.add(a,b);
        k.display();
    }
}