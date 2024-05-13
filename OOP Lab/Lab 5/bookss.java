import java.util.Scanner;

class book{
    String name;
    String Author;
    int edition;
    book()
    {
        name="";
        Author="";
        edition=-1;
    }
    book(String NAME, String AUTHOR, Integer Edition)
    {
        name=NAME;
        Author=AUTHOR;
        edition=Edition;
    }
    boolean isBookby(String AUTHOR)
    {
        if(Author.equals(AUTHOR)) return true;
        return false;
    }
    void display()
    {
        System.out.println("\n\nBook:"+name+"\nBy:"+Author+"\nEdition:"+edition);
    }
}
public class bookss {
    public static void main(String args[]){
    book blist[]=new book[6];
    Scanner in=new Scanner(System.in);
    for(int i=0; i<6; i++)
    {
        String name;
        String Author;
        int edition;
        System.out.print("Entr the name of Book:");
        name=in.nextLine();
        System.out.print("Entr the Edition of Book:");
        edition=in.nextInt();
        in.nextLine();
        System.out.print("Entr the Author of Book:");
        Author=in.nextLine();
        blist[i]=new book(name,Author,edition);
        System.out.println();
    }
    String check="Harry";
    for(int i=0; i<6;i++)
    {
        if(blist[i].isBookby(check))
        {
            blist[i].display();
        }
    }
}
}

