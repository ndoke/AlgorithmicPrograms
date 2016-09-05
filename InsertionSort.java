import java.util.Arrays;

public class InsertionSort {

	public static void insertionSort(int a[]) {
		for (int i = 1; i < a.length; i++) {
			// set current element as the key
			int key = a[i];

			// set the previous element as pivot
			int j = i - 1;

			// go on testing from the pivot whether the elements are in order
			while (j > -1 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
			System.out.println(Arrays.toString(a));
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[] = { 7, 2, 3, 9, 5, 1, 6, 4 };
		insertionSort(a);
	}

}
