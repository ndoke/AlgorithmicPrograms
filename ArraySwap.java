import java.util.Arrays;

public class ArraySwap {

	public static void swapArrayElement(int i, int j, int arr[]) {
		arr[i] = arr[i] - arr[j];
		arr[j] = arr[i] + arr[j];
		arr[i] = arr[j] - arr[i];
	}

	public static void main(String[] args) {
		int arr[] = { 5, 4, 3, 2, 1 };
		swapArrayElement(2, 3, arr);
		System.out.println(Arrays.toString(arr));
	}

}
