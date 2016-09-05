import java.util.Scanner;

public class LoopingWithRecursion {

	private static void printNNumber(int n, int m) {
		System.out.print(n + " ");
		if (n != m)
			printNNumber(n + 1, m);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		printNNumber(1, n);
	}

}
