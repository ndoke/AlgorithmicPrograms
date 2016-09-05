import java.util.Arrays;

public class NumberWithGivenProductArray {

	/* Time complexity is O(n * log(n)) */

	public static boolean prodExists(int arr[], int num) {
		// sort the array first
		Arrays.sort(arr);

		// loop through the array checking the products
		int i = 0, j = arr.length - 1;
		while (i < j) {
			if (arr[i] * arr[j] < num)
				i++;
			else if (arr[i] * arr[j] > num)
				j--;
			else
				return true;
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { 5, 2, 7, 8, 3, 9, 6 };
		int num = 17;
		System.out.println(prodExists(arr, num));
	}

}
