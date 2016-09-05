import java.util.Scanner;

public class NInputANDgate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n");
		int n = sc.nextInt();

		System.out.println("Enter " + n + " binary bits");
		int t = sc.nextInt();
		for (int i = 1; i < n; i++)
			t &= sc.nextInt();
		sc.close();
		System.out.println(t);
	}

}
