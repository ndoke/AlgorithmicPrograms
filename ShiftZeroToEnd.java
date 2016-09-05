import java.util.Arrays;

public class ShiftZeroToEnd {

	public static int[] shiftZeroToEnd(int arr[]) {

		// loop from second last element to last element
		for (int i = arr.length - 2; i > 0; i--) {
			// if the current element is zero, shift it to the end of the array
			if (arr[i] == 0) {
				int j = i;
				while (j < arr.length - 1) {
					// swap arr[i] with arr[i + 1]
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					j++;
				}
			}
		}

		return arr;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 3, 0, 8, 12, 0, 4, 0, 7 };
		System.out.println(Arrays.toString(shiftZeroToEnd(arr)));
	}

}
