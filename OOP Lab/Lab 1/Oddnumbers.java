class Oddnumbers
{
	public static void main(String args[])
	{
		int num=1,i;
		for(i=0;i<100;i++,num++)
		{
			if (num%2==0)
			{
				continue;
			}
			else if(num%2!=0)
			{
				System.out.println(num);
			}	
		}	
	}
}