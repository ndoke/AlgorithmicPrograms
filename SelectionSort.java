import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int a[]) {
		int pointer = 0;
		while (pointer < a.length) {
			// find minimum element
			int minInd = pointer;
			for (int i = pointer + 1; i < a.length; i++) {
				if (a[i] < a[minInd])
					minInd = i;
			}
			// swap it with the pointer
			int temp = a[pointer];
			a[pointer] = a[minInd];
			a[minInd] = temp;
			// increment the pointer
			pointer++;
		}
		System.out.println(Arrays.toString(a));
	}

	public static void main(String[] args) {
		int a[] = { 2, 7, 3, 9, 5, 1, 6, 4 };
		selectionSort(a);
	}

}
