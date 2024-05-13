class TenNumbers
{
	public static void main(String args[])
	{
		int i,pos=0,zer=0,neg=0;
		int[]a=new int[10];
		for(i=0;i<10;i++)
		{
		a[i]=Integer.parseInt(args[i]);
		if (a[i]>0)
		{
			System.out.println(a[i]+" is a positive number");
			pos++;
			
		}
		if(a[i]<0)
		{
			System.out.println(a[i]+" is a negative number");
			neg++;
		}
		else if(a[i]==0)
		{
			System.out.println(a[i]+" is zero");
			zer++;
		}
		}
		System.out.println("Number of positive numbers are: "+pos);
		System.out.println("Number of negative numbers are: "+neg);
		System.out.println("Number of zeroes are: "+zer);
	}
}