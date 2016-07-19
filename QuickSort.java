import java.util.ArrayList;
import java.util.Scanner;

public class QuickSort {

	public static ArrayList<Integer> partition(ArrayList<Integer> arL) {
		if (arL.size() >= 1) {
			int pivot = arL.get(0);
			ArrayList<Integer> lfHnd = new ArrayList<Integer>();
			ArrayList<Integer> rtHnd = new ArrayList<Integer>();
			for (int i = 1; i < arL.size(); i++) {
				int temp = arL.get(i);
				if (temp <= pivot)
					lfHnd.add(temp);
				else
					rtHnd.add(temp);
			}

			ArrayList<Integer> retArrList = new ArrayList<Integer>();
			if (!lfHnd.isEmpty())
				retArrList.addAll(quickSort(lfHnd));
			retArrList.add(pivot);
			if (!rtHnd.isEmpty())
				retArrList.addAll(quickSort(rtHnd));

			if (retArrList.size() > 1) {
				for (int i = 0; i < retArrList.size(); i++) {
					System.out.print(retArrList.get(i) + " ");
				}
				System.out.println();
			}

			return retArrList;
		}
		return null;
	}

	public static ArrayList<Integer> quickSort(ArrayList<Integer> arL) {
		ArrayList<Integer> retArrList = new ArrayList<Integer>();
		retArrList = partition(arL);
		return retArrList;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> arL = new ArrayList<Integer>();
		@SuppressWarnings("unused")
		ArrayList<Integer> finalArrL = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			arL.add(sc.nextInt());
		}
		sc.close();
		finalArrL = quickSort(arL);
	}
}

/*
 * 7 5 8 1 3 7 9 2
 */