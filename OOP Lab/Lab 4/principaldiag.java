import java.util.Scanner;
class principaldiag
{
    public static void main(String args[])
    {
        int [][]a=new int[50][50];
        int i,j,m,sum=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the order of the square matrix: ");
        m=sc.nextInt();
        System.out.println("Enter the elements of the matrix: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("The matrix is: ");
        for(i=0;i<m;i++)
        {
            for(j=0;j<m;j++)
            {
                System.out.print(a[i][j]+" ");
            }
         System.out.println();
        }
        System.out.println("The principal diagonal elements are: ");
        for(i=0;i<m;i++)
        {
           System.out.print(a[i][i]+ " ");
        }
        for(i=0;i<m;i++)
        {
            
            sum=sum+a[i][i];
        
        }
System.out.println("\nThe sum of the principal diagonal elements is: "+sum);
    }
}
    

