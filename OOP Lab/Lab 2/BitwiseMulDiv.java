import java.util.Scanner;
public class BitwiseMulDiv {

	public static void main(String[] args) {
		int num, prod, quot;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		prod = num << 1;
		quot = num >> 1;
		System.out.println(num + " multiplied by 2 = " + prod + "\n" + "divided by 2 = " + quot);
	}

}
