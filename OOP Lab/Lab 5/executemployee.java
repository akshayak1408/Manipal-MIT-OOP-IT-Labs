import java.util.Scanner;
class Employee
{
    String name,city;
    double basic,da,hra,Total;
   Employee(){}
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
            System.out.println("Enter name: ");
            name=sc.next();
            System.out.println("Enter city: ");
            city=sc.next();
            System.out.println("Enter basic salary: ");
            basic=sc.nextDouble();
            System.out.println("Enter dearness allowance: ");
            da=sc.nextDouble();
            System.out.println("Enter house rent: ");
            hra=sc.nextDouble();
    }
    void calculate()
    {
        Total=basic+basic*da/100+basic*hra/100;
    }
    void display()
    {
		  System.out.println("Name: "+name);
		  System.out.println("City:"+city);
		  System.out.println("Basic Salary: "+basic);
		  System.out.println("Dearness allowance: "+da);
		  System.out.println("House rent: "+hra);
		  System.out.println("Total salary: "+Total);
    }
}
class executemployee
{
    public static void main(String args[])
    {
		Employee e=new Employee();
		Scanner s=new Scanner(System.in);
		int n;
       System.out.println("Enter the number of data to input: ");
	   n=s.nextInt();
        for(int i=0;i<n;i++)
        {
            System.out.println("Employee "+(i+1)+":");
			e.getdata();
			e.calculate();
			e.display();         
        }
    }
}