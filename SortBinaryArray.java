import java.util.Arrays;

public class SortBinaryArray {

	/* The algorithm runs for O(n) */
	private static int[] sortArr(int[] arr) {
		int pointer = 0, i = 0;
		while (pointer < arr.length) {
			if (arr[pointer] == 0) {
				int temp = arr[i];
				arr[i] = arr[pointer];
				arr[pointer] = temp;
				i++;
				pointer++;
			} else
				pointer++;
		}
		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 0, 1,
				1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 0 };
		System.out.println(Arrays.toString(sortArr(arr)));
	}
}
