
public class RotatingAMatrix {

	public static void printMat(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[0].length; j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	private static void transpose(int[][] m) {

		for (int i = 0; i < m.length; i++) {
			for (int j = i; j < m[0].length; j++) {
				int x = m[i][j];
				m[i][j] = m[j][i];
				m[j][i] = x;
			}
		}
	}

	public static void swapRows(int[][] m) {
		for (int i = 0, k = m.length - 1; i < k; ++i, --k) {
			int[] x = m[i];
			m[i] = m[k];
			m[k] = x;
		}
	}

	public static void rotateByNinetyToLeft(int[][] m) {
		transpose(m);
		swapRows(m);
	}

	public static void rotateByNinetyToRight(int[][] m) {
		swapRows(m);
		transpose(m);
	}

	public static void main(String[] args) {
		int[][] mEven = { { 1, 3 }, { 2, 4 } };

		printMat(mEven);

		System.out.println("---------------------------------");

		rotateByNinetyToLeft(mEven);

		printMat(mEven);

		System.out.println("---------------------------------");

		rotateByNinetyToRight(mEven);

		printMat(mEven);

		System.out.println("---------------------------------");

		int[][] mOdd = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

		printMat(mOdd);

		System.out.println("---------------------------------");

		rotateByNinetyToLeft(mOdd);

		printMat(mOdd);

		System.out.println("---------------------------------");

		rotateByNinetyToRight(mOdd);

		printMat(mOdd);

		System.out.println("---------------------------------");

	}
}
