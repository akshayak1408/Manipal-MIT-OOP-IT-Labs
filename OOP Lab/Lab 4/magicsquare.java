import java.util.Scanner;
class magicsquare{
    public static void main(String args[])
    {
        Scanner obj=new Scanner (System .in);
        System.out.println("Enter the dimension of the matrix");
        int n=obj.nextInt();
        int a[][]=new int[n][n];
        System.out.println("Enter the elements in the array");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=obj.nextInt();
            }
        }
        int pd=0,npd=0;
        int flag=1;
        int rowsum[]=new int[n];
        int colsum[]=new int[n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                rowsum[i]+=a[i][j];
                colsum[i]+=a[j][i];
                if(i==j)
                pd+=a[i][j];
                else if(i==(j-i)){
                    npd+=a[i][j];
                }

            }
        }
       m: for(int i=0;i<n-1;i++){
            if(rowsum[i]!=rowsum[i+1]||colsum[i]!=colsum[i+1]){
                if(pd!=npd){
                    flag=0;
                    break m;
                }
                flag=0;
                break m;
            }  
        }
        if(flag==1)
        System.out.println("It is a Magic Square Matrix");
        else
        System.out.println("It is not a Magic Square Matrix"); 
    }
}