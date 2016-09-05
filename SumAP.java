import java.util.Scanner;

public class SumAP {

	private static int findSum(int a, int d, int n) {
		return a * n + n * (n - 1) * d / 2;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first term");
		int a = sc.nextInt();
		System.out.println("Enter common difference");
		int d = sc.nextInt();
		System.out.println("Enter number of terms");
		int n = sc.nextInt();
		sc.close();
		System.out.println(findSum(a, d, n));
	}
}
