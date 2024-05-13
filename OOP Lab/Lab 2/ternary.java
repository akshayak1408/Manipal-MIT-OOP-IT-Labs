import java.util.Scanner;

class Ternary {
	public static void main(String args[]) {
		int a, b, c, result;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number:");
		a = in.nextInt();
		System.out.println("Enter Second Number:");
		b = in.nextInt();
		System.out.println("Enter Third Number:");
		c = in.nextInt(); 
		System.out.println("Largest Number is: " + (a>b)?(a>c?a:c):(b>c?b:c));
	}
}
}