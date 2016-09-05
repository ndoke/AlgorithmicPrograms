import java.util.Scanner;

public class InvertedStar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();

		for (int i = 0; i < n; i++) {
			for (int k = 0; k < i; k++)
				System.out.print(" ");
			for (int j = i; j < n; j++)
				System.out.print("*");
			for (int j = i; j < n - 1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
}
