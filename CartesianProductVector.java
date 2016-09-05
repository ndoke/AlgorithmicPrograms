import java.util.ArrayList;

public class CartesianProductVector {

	public static void myGenArrayList(ArrayList<ArrayList<String>> a) {
		int solutions = 1;

		for (int i = 0; i < a.size(); i++)
			solutions *= a.get(i).size();

		for (int i = 0; i < solutions; i++) {
			int j = 1;
			for (ArrayList<String> str : a) {
				System.out.print(str.get((i / j) % str.size()) + " ");
				j *= str.size();
			}
			System.out.println();
		}
	}

	public static void myGen(String a[][]) {
		int solutions = 1;
		for (int i = 0; i < a.length; i++)
			solutions *= a[i].length;

		for (int i = 0; i < solutions; i++) {
			int j = 1;
			for (String str[] : a) {
				System.out.print(str[(i / j) % str.length] + " ");
				j *= str.length;
			}
			System.out.println();
		}
	}

	public static void generate(int[][] sets) {
		int solutions = 1;

		for (int i = 0; i < sets.length; i++)
			solutions *= sets[i].length;

		for (int i = 0; i < solutions; i++) {
			int j = 1;
			for (int[] set : sets) {
				System.out.print(set[(i / j) % set.length] + " ");
				j *= set.length;
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// generate(new int[][] { { 1, 2, 3 }, { 3, 2 }, { 5, 6, 7 } });
		myGen(new String[][] { { "abc", "def", "ghi" }, { "pqr", "lmn" }, { "xyz", "jkl" } });
		ArrayList<String> arrL1 = new ArrayList<String>();
		ArrayList<String> arrL2 = new ArrayList<String>();
		ArrayList<String> arrL3 = new ArrayList<String>();
		ArrayList<ArrayList<String>> arrL = new ArrayList<ArrayList<String>>();
		arrL1.add("abc");
		arrL1.add("def");
		arrL1.add("ghi");
		arrL1.add("ghi");
		arrL2.add("pqr");
		arrL2.add("lmn");
		arrL3.add("xyz");
		arrL3.add("jkl");
		arrL.add(arrL1);
		arrL.add(arrL2);
		arrL.add(arrL3);
		System.out.println("///////////////////////////////////////////////");
		myGenArrayList(arrL);
	}
}
