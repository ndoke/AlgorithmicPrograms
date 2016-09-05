import java.util.Scanner;

public class PrintY {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n % 2 != 0)
			n -= 1;
		sc.close();
		int t = n - 1;
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < i; j++)
				System.out.print(" ");
			System.out.print("*");
			for (int j = t; j > 0; j--)
				System.out.print(" ");
			t -= 2;
			System.out.println("*");
		}
		for (int i = 0; i < n / 2; i++) {
			for (int j = 0; j < n / 2; j++)
				System.out.print(" ");
			System.out.println("*");
		}
	}
}
