
public class Celebrity {

	public static void main(String[] args) {
		int a[][] = { { 999, 1, 1, 1, 0, 1, 1 }, { 0, 999, 0, 1, 1, 0, 1 }, { 0, 1, 999, 0, 0, 1, 1 },
				{ 1, 1, 0, 999, 0, 0, 1 }, { 0, 1, 1, 1, 999, 0, 1 }, { 0, 1, 0, 0, 0, 999, 1 },
				{ 0, 0, 0, 0, 0, 0, 999 } };

		int i = 0, j = 1;
		do {
			if (a[i][j] == 0) {
				j++;
				if (j >= a.length || i >= a.length)
					break;
			} else if (a[i][j] == 1) {
				i = j;
				j = i + 1;
				if (j >= a.length || i >= a.length)
					break;
			}
		} while (i < a.length || j < a.length);
		System.out.println(i);
	}

}
