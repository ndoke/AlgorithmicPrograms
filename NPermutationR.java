import java.util.Scanner;

public class NPermutationR {

	private static int permute(int n, int r) {
		if (n < r)
			return -1;
		else {
			int i = n - r + 1;
			int result = 1;
			while (i <= n) {
				result *= i;
				i++;
			}
			return result;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();
		System.out.println("Enter r");
		int r = sc.nextInt();
		sc.close();
		System.out.println(permute(n, r));
	}

}
