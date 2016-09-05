import java.util.Arrays;

public class MergerSort {

	/* method to partition */
	public static int[] partition(int a[]) {
		int lhf[] = new int[(a.length + 1) / 2];
		int rhf[] = new int[a.length / 2];
		for (int i = 0; i < (a.length + 1) / 2; i++) {
			lhf[i] = a[i];
		}
		for (int i = (a.length + 1) / 2; i < a.length; i++) {
			rhf[i - (a.length + 1) / 2] = a[i];
		}
		return merge(mergeSort(lhf), mergeSort(rhf));
	}

	/* method to merge */
	private static int[] merge(int[] lhf, int[] rhf) {
		int retArr[] = new int[lhf.length + rhf.length];
		int i = 0, j = 0, k = 0;
		while (i < lhf.length && j < rhf.length) {
			if (lhf[i] < rhf[j])
				retArr[k++] = lhf[i++];
			else if (lhf[i] > rhf[j])
				retArr[k++] = rhf[j++];
			else {
				retArr[k++] = lhf[i++];
				j++;
			}
		}
		while (i < lhf.length) {
			retArr[k++] = lhf[i++];
		}
		while (j < rhf.length) {
			retArr[k++] = rhf[j++];
		}
		return retArr;
	}

	/* method for implementing merge sort */
	public static int[] mergeSort(int a[]) {
		if (a.length > 1)
			return partition(a);
		else
			return a;
	}

	public static void main(String[] args) {
		int a[] = { 7, 2, 3, 9, 5, 1, 6, 4, 8 };
		System.out.println(Arrays.toString(mergeSort(a)));
	}

}
