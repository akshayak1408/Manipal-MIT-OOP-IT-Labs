class Multitable
{
	public static void main(String args[])
	{
		int num,i,multi=1;
		num=Integer.parseInt(args[0]);
		for(i=1;i<=10;i++)
		{
			multi=num*i;
			System.out.println(num+"*"+i+"="+multi);
		}
	}
}