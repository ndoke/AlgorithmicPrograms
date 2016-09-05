import java.util.ArrayList;
import java.util.Arrays;

public class QuickSortNew {

	public static int[] quickSort(int a[]) {
		int lfSize = 0, rtSize = 0, pivot = a[a.length - 1];

		// calculate left and right sides
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] <= pivot)
				lfSize++;
			else
				rtSize++;
		}

		int lfArr[] = new int[lfSize];
		int rtArr[] = new int[rtSize];

		// put elements in respective arrays
		int j = 0, k = 0;
		for (int i = 0; i < a.length - 1; i++) {
			if (a[i] <= pivot)
				lfArr[j++] = a[i];
			else
				rtArr[k++] = a[i];
		}

		int retArr[] = new int[lfArr.length + 1 + rtArr.length];
		if (lfArr.length == 1)
			System.arraycopy(lfArr, 0, retArr, 0, lfSize);
		else if (lfArr.length > 1)
			System.arraycopy(quickSort(lfArr), 0, retArr, 0, lfSize);

		retArr[lfSize] = pivot;

		if (rtArr.length == 1)
			System.arraycopy(rtArr, 0, retArr, lfSize + 1, rtSize);
		else if (rtArr.length > 1)
			System.arraycopy(quickSort(rtArr), 0, retArr, lfSize + 1, rtSize);

		return retArr;

	}

	public static ArrayList<Integer> quickSort(ArrayList<Integer> a) {
		ArrayList<Integer> lhf = new ArrayList<Integer>();
		ArrayList<Integer> rhf = new ArrayList<Integer>();
		int pivot = a.get(a.size() - 1);
		for (int i = 0; i < a.size() - 1; i++) {
			if (a.get(i) <= pivot)
				lhf.add(a.get(i));
			else
				rhf.add(a.get(i));
		}
		ArrayList<Integer> retList = new ArrayList<Integer>();
		if (lhf.size() > 1)
			retList.addAll(quickSort(lhf));
		else
			retList.addAll(lhf);

		retList.add(pivot);

		if (rhf.size() > 1)
			retList.addAll(quickSort(rhf));
		else
			retList.addAll(rhf);
		return retList;
	}

	public static void main(String[] args) {
		int a[] = { 7, 2, 8, 3, 9, 1, 6, 4, 5 };
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int x : a)
			arr.add(x);
		System.out.println(Arrays.toString(quickSort(a)));
	}

}
