import java.util.Arrays;
import java.util.Random;

public class NrandomNumbersArray {

	public static int[] retnNumbers(int arr[], int n) {
		int retArr[] = new int[n];
		int limit = arr.length;
		for (int i = 0; i < n; i++) {
			// select a random index
			Random rnd = new Random();
			int index = rnd.nextInt(limit);
			retArr[i] = arr[index];

			// swap the value of the index with the last number
			arr[limit - 1] = arr[limit - 1] ^ arr[index];
			arr[index] = arr[limit - 1] ^ arr[index];
			arr[limit - 1] = arr[limit - 1] ^ arr[index];

			// decrement limit
			limit--;
		}
		return retArr;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 1, 4, 2, 8, 3, 6, 10, 5 };
		int n = 9;
		System.out.println(Arrays.toString(retnNumbers(arr, n)));
	}

}
