import java.util.Scanner;

public class NewYearChaos {

	public static void main(String[] args) {
		/*
		 * Enter your code here. Read input from STDIN. Print output to STDOUT.
		 * Your class should be named Solution.
		 */
		Scanner sc = new Scanner(System.in);
		int numT = sc.nextInt();
		for (int i = 0; i < numT; i++) {
			int size = sc.nextInt();
			int arr[] = new int[size];
			String str = "";

			// input queue
			for (int j = 0; j < size; j++) {
				arr[j] = sc.nextInt();
			}

			// calculating max bribes
			for (int j = 0; j < size; j++) {
				if (arr[j] - j > 3) {
					str = "Too chaotic";
					break;
				}
			}

			if (str.equals("Too chaotic"))
				System.out.println(str);
			else {
				int numBribes = 0;
				int p = 0, q = 1;
				while (p < arr.length && q < arr.length) {
					if (arr[q] < arr[p]) {
						int temp = arr[p];
						arr[p] = arr[q];
						arr[q] = temp;
						// System.out.println(Arrays.toString(arr));
						p = 0;
						q = 1;
						numBribes++;
					} else {
						p++;
						q++;
					}
				}
				System.out.println(numBribes);
			}
		}
		sc.close();

		// int inputLine[] = { 1, 2, 5, 3, 7, 8, 6, 4 };
		// boolean finished = false;
		// while (!finished) {
		// finished = true;
		// for (int a = 0; a < inputLine.length - 1; a++) {
		// if (inputLine[a] > inputLine[a + 1]) {
		// int temp = inputLine[a];
		// inputLine[a] = inputLine[a + 1];
		// inputLine[a + 1] = temp;
		// finished = false;
		// }
		// }
		// }
		// System.out.println(Arrays.toString(inputLine));
	}

}
