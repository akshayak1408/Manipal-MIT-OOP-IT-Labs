import java.util.Scanner;
class armstrong{
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter a number");
        int num =obj.nextInt();
        int r,sum=0,d;
        d=num;
        while(d!=0){
            r=d%10;
            sum+=r*r*r;
            d=d/10;
           
        }
        if(sum==num)
            System.out.println("The given number is an armstrong number");
        else
            System.out.println("The given number is not an armstrong number");
    }
}
