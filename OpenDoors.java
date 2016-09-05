import java.util.Scanner;

public class OpenDoors {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int openDoors = 0;
		// loop through the doors
		for (int i = 1; i <= n; i++) {
			int count = 0;
			// loop through the factors of door numbers
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					count++;
			}
			if (count % 2 != 0)
				openDoors++;
		}
		System.out.println(openDoors);
		sc.close();
	}

}
