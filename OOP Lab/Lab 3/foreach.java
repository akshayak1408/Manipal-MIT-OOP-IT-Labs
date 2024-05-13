import java.util.Scanner;
public class foreach{

    public static void main(String[] args) {
       Scanner obj= new Scanner(System.in);
       int arr[]={1,2,3,4,5};
       for(int i:arr){
           for(int j:arr){
            if(j<=i)
               System.out.print(i);
           }
           System.out.println(" ");
       }
    } 
}
