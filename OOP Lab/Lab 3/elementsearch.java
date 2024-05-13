import java.util.Scanner;
class elementsearch {
    public static void main(String a[]){
        Scanner sc=new Scanner(System.in);
        int a1[]={1,2,3,4,5,6,7,8,9};
        int j,pos=0,ele,flag=0;
        System.out.println("Enter the element to be searched");
        ele=sc.nextInt();
        
        for(int num:a1){
            flag=0;
            if(num!=ele)
            pos++;
            if(num==ele){
                
                flag=1;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element "+ele+" is found at index "+ (pos+1));
        }}}