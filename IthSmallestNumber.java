import java.util.Random;

public class IthSmallestNumber {

	public static void rndSelect(int a[], int p, int r, int n) {
		System.out.println(p + " & " + r);
		int lfSize = 0, rtSize = 0, pivot = findRandom(p, r);

		// calculate left and right sides
		for (int i = 0; i < a.length; i++) {
			if (a[i] <= a[pivot])
				lfSize++;
			else
				rtSize++;
		}

		int lfArr[] = new int[lfSize];
		int rtArr[] = new int[rtSize];

		// put elements in respective arrays
		int j = 0, k = 0;
		for (int i = 0; i < a.length; i++) {
			if (i != pivot) {
				if (a[i] < a[pivot])
					lfArr[j++] = a[i];
				else if (a[i] > a[pivot])
					rtArr[k++] = a[i];
			}
		}
		lfArr[j] = a[pivot];

		if (n < pivot) {
			System.arraycopy(a, 0, lfArr, 0, lfSize);
			System.arraycopy(a, lfSize, rtArr, 0, rtSize);
			rndSelect(a, p, pivot - 1, n);
		} else if (n > pivot) {
			System.arraycopy(a, 0, lfArr, 0, lfSize);
			System.arraycopy(a, lfSize, rtArr, 0, rtSize);
			rndSelect(a, pivot + 1, r, n);
		} else
			System.out.println(a[pivot]);
	}

	public static int findRandom(int i, int j) {
		Random rnd = new Random();
		if (i == 0)
			return rnd.nextInt(j - i + 1);
		else
			return rnd.nextInt(j - i + 1) + i;
	}

	public static void main(String[] args) {
		int arr[] = { 7, 1, 4, 2, 8, 3, 6, 9, 5, 0 };
		rndSelect(arr, 0, arr.length - 1, 0);
		rndSelect(arr, 0, arr.length - 1, 2);
		rndSelect(arr, 0, arr.length - 1, 3);
		rndSelect(arr, 0, arr.length - 1, 4);
		rndSelect(arr, 0, arr.length - 1, 5);
		rndSelect(arr, 0, arr.length - 1, 6);
		rndSelect(arr, 0, arr.length - 1, 7);
		rndSelect(arr, 0, arr.length - 1, 8);
		rndSelect(arr, 0, arr.length - 1, 9);
		rndSelect(arr, 0, arr.length - 1, 10);
	}

}
