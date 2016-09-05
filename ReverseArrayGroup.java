import java.util.*;

class ReverseArrayGroup {

	public static int[] revArr(int arr[], int k) {
		// loop through the array
		for (int i = 0; i < arr.length; i = i + k) {
			// in a nested loop, loop for k elements
			int j = i;
			int limit = (j + k > arr.length) ? arr.length - 1 : j + k - 1;
			while (j < limit) {
				arr[j] = arr[j] ^ arr[limit];
				arr[limit] = arr[j] ^ arr[limit];
				arr[j] = arr[j] ^ arr[limit];
				j++;
				limit--;
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		// code
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int j = 0; j < n; j++)
			arr[j] = sc.nextInt();
		int k = sc.nextInt();
		System.out.println(Arrays.toString(revArr(arr, k)));

		sc.close();
	}
}