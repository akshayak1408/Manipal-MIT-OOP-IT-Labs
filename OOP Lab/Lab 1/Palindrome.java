class Palindrome
{
	public static void main(String args[])
	{
		int n,num,rev=0,rem=0;
		num=Integer.parseInt(args[0]);
		n=num;
		while(n!=0)
		{
			rem=n%10;
			n=n/10;
			rev=rev*10+rem;
		}
		if(num==rev)
			{
				System.out.println(num+" is a palindrome");
			}
		else
		{
			System.out.println(num+" is not a palindrome");
		}
	}	
}			