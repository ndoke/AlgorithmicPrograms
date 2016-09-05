import java.util.Arrays;
import java.util.Scanner;

public class AlternateMinMax {

	private static int[] printAlternateMinMax(int[] arr) {
		// sort the array
		arr = CountingSort.sortAsce(arr);

		// define a new array
		int retArr[] = new int[arr.length];

		// traverse from the opposite ends to the middle of the array
		int i = 0, j = arr.length - 1, pointer = 0;
		while (i <= j) {
			if (pointer % 2 == 0)
				retArr[pointer++] = arr[i++];
			else
				retArr[pointer++] = arr[j--];
		}

		// return the new array
		return retArr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		sc.close();
		System.out.println(Arrays.toString(printAlternateMinMax(arr)));
	}

}
