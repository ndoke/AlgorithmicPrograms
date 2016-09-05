import java.util.Arrays;

public class ProductAllIntegers {

	private static void getProductOfAllIntegers(int[] a) {
		int beforeArr[] = new int[a.length];
		int afterArr[] = new int[a.length];
		int resultArr[] = new int[a.length];

		// calculate before array
		for (int i = 0; i < beforeArr.length; i++)
			beforeArr[i] = 1;

		for (int i = 1; i < a.length; i++)
			beforeArr[i] = a[i - 1] * beforeArr[i - 1];
		System.out.println(Arrays.toString(beforeArr));

		// calculate after array
		for (int i = 0; i < afterArr.length; i++)
			afterArr[i] = 1;

		for (int i = a.length - 2; i >= 0; i--)
			afterArr[i] = a[i + 1] * afterArr[i + 1];
		System.out.println(Arrays.toString(afterArr));

		// calculate the final array
		for (int i = 0; i < a.length; i++)
			resultArr[i] = beforeArr[i] * afterArr[i];
		System.out.println(Arrays.toString(resultArr));
	}

	public static void main(String[] args) {
		int a[] = { 1, 2, 6, 5, 9, 0 };
		getProductOfAllIntegers(a);
	}

}
