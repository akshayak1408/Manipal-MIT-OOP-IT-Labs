import java.util.Scanner;
class LeapYear {

	private static Scanner in;

	public static void main(String[] args) {
		int year;
		System.out.println("Enter year:");
		in = new Scanner(System.in);
		year = in.nextInt();
		boolean leap = false;
	    if (year % 4 == 0) {
	      if (year % 100 == 0) {
	        if (year % 400 == 0)
	          leap = true;
	        else
	          leap = false;
	      }
	      else
	        leap = true;
	    }
	    else
	      leap = false;
	    if(leap) System.out.println("The year is a leap year.");
	    else System.out.println("The year is not a leap year.");
	}

}
