import java.util.Scanner;

public class CheckSqaure {

	private static int checkSquare(int n) {
		if (n == 1)
			return 1;
		else {
			for (int i = 2; i < n; i++) {
				if (n % i == 0 && (n / i) * (n / i) == n)
					return 1;
			}
			return 0;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		System.out.println(checkSquare(n));
	}

}
