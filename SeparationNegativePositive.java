import java.util.ArrayList;

public class SeparationNegativePositive {

	public static ArrayList<Integer> sepNegPos(ArrayList<Integer> arr) {
		ArrayList<Integer> retList = new ArrayList<Integer>();

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) < 0)
				retList.add(arr.get(i));
		}

		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) >= 0)
				retList.add(arr.get(i));
		}

		return retList;
	}

	public static void main(String[] args) {
		int arr[] = { 1, 4, -1, -5, 3, -2, 0, 9, -10, 5, -7 };
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < arr.length; i++) {
			arrList.add(arr[i]);
		}
		System.out.println(sepNegPos(arrList));
	}

}
