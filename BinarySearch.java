import java.util.Arrays;
import java.util.HashMap;
import java.util.Hashtable;

/*This program implements the Binary Search logic
  using an array of integers and searching a value in it*/

public class BinarySearch {

	public BinarySearch(int[] arr, int num) {
		Arrays.sort(arr);
		int lfEnd = 0, rgEnd = arr.length - 1;
		int numInd = -1;
		// Binary search logic
		while (lfEnd <= rgEnd) {
			int tempInd = (lfEnd + rgEnd) / 2;
			if (arr[tempInd] < num)
				lfEnd = tempInd + 1;
			else if (arr[tempInd] > num)
				rgEnd = tempInd - 1;
			else {
				numInd = tempInd;
				break;
			}
		}

		if (numInd != -1)
			System.out.println("The number is at index " + numInd);
		else
			System.out.println("The number is not in the array");
	}

	/*
	 * Method to find the number in the array equal to the number that is being
	 * searched and return it
	 */
	public int findSum(int arr[], int num) {
		int sum = 0;
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < arr.length; i++) {
			ht.put(i, arr[i]);
			hm.put(i, arr[i]);
		}
		for (int i = 0; i < arr.length; i++) {
			int temp1 = arr[i] - num;
			if (hm.containsValue(temp1))
				sum++;
		}

		return sum;
	}

	public static void main(String[] args) {
		int a[] = { 1, 7, 5, 9, 2, 12, 3 };
		Hashtable<Integer, Integer> ht = new Hashtable<Integer, Integer>();
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for (int i = 0; i < a.length; i++) {
			ht.put(i, a[i]);
			hm.put(i, a[i]);
		}

		BinarySearch bs = new BinarySearch(a, 5);
		int temp = bs.findSum(a, 2);
		System.out.println(temp);
	}

}
