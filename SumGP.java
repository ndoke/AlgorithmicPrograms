import java.util.Scanner;

public class SumGP {

	private static double findSum(int a, double r, int n) {
		if (r < 1)
			return a * (1 - Math.pow(r, n)) / (1 - r);
		else
			return a * (Math.pow(r, n) - 1) / (r - 1);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first term");
		int a = sc.nextInt();
		System.out.println("Enter common ratio");
		double r = sc.nextDouble();
		System.out.println("Enter number of terms");
		int n = sc.nextInt();
		sc.close();
		System.out.println(findSum(a, r, n));
	}
}
