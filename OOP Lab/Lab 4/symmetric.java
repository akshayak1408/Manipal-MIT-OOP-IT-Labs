import java.util.Scanner;
public class symmetric
{
    public static void main(String args[])
    {
        int [][]a=new int[50][50];
        int i,j,n,symm=0;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the order of the square matrix: ");
        n=sc.nextInt();
        System.out.println("Enter the elements of the matrix: ");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i][j]!=a[j][i])
                {
                    
                  symm=0;
                  break;
                }
                else
                {
                    symm=1;
                }
                
            }
}
            if(symm==1)
            {
                System.out.println("The given matrix is symmetric.");
            }
            else
            {
                System.out.println("The given matrix is not symmetric.");
            }
    }
}