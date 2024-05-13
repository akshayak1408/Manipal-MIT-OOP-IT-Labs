/*Write a Java program to find whether a given year is leap or not using boolean data 
type. [Hint: leap year has 366 days;]
Algorithm:
if (year is not exactly divisible by 4) then (it is a common year)
else
if (year is not exactly divisible by 100) then (it is a leap year)
else
if (year is not exactly divisible by 400) then (it is a common year)
else (it is a leap year)*/

class Leapyear
{
	public static void main(String args[])
	{
		int year;
		year=Integer.parseInt(args[0]);
		
		if(year%4!=0)
		{
			System.out.println("It is a common year");
		}
		else if(year%100!=0)
		{
			System.out.println("It is a leap year");
		}
		else if(year%400!=0)
		{
			System.out.println("It is a common year");
		}
		else
		{
			System.out.println("It is a leap year");
		}
	}
}