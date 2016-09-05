
public class SumDiffFact {

	private static int fact(int n) {
		if (n == 1)
			return n;
		else
			return n * fact(n - 1);
	}

	public static void main(String[] args) {
		int n = 10;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0)
				sum -= fact(i);
			else
				sum += fact(i);
		}
		System.out.println(sum);
	}

}
