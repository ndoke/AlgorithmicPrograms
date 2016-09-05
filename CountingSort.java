import java.util.Arrays;

public class CountingSort {

	public static int[] sortDesc(int[] a) {
		// find max element
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}
		System.out.println(max);
		// count occurrence of each number
		int counts[] = new int[max + 1];
		for (int i = 0; i < a.length; i++) {
			counts[a[i]]++;
		}

		// cumulative counts
		for (int i = counts.length - 2; i >= 0; i--) {
			counts[i] = counts[i + 1] + counts[i];
		}

		// save the values in output array
		int b[] = new int[a.length + 1];
		for (int i = a.length - 1; i >= 0; i--) {
			b[counts[a[i]]] = a[i];
			counts[a[i]]--;
		}
		return b;
	}

	public static int[] sortAsce(int[] a) {
		// find max element
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max < a[i])
				max = a[i];
		}

		// count occurrence of each number
		int counts[] = new int[max + 1];
		for (int i = 0; i < a.length; i++) {
			counts[a[i]]++;
		}

		// cumulative counts
		for (int i = 1; i < counts.length; i++) {
			counts[i] = counts[i - 1] + counts[i];
		}

		// save the values in output array
		int b[] = new int[a.length + 1];
		for (int i = a.length - 1; i >= 0; i--) {
			b[counts[a[i]]] = a[i];
			counts[a[i]]--;
		}
		return b;
	}

	public static void main(String[] args) {
		// int input[] = { 2, 1, 4, 5, 7, 1, 1, 8, 9, 10, 11, 14, 15, 3, 2, 4 };
		int input[] = { 2, 1, 4, 5, 7, 0 };
		System.out.println("Orginal Array: " + Arrays.toString(input));
		int[] B = sortAsce(input);
		System.out.println("Sorted Array : " + Arrays.toString(B));
		int[] C = sortDesc(input);
		System.out.println("Sorted Array : " + Arrays.toString(C));
	}
}