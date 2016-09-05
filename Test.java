
class Sol {
	public int maxSubArray(int[] A) {
		int max = A[0];
		int[] sum = new int[A.length];
		sum[0] = A[0];

		for (int i = 1; i < A.length; i++) {
			sum[i] = Math.max(A[i], sum[i - 1] + A[i]);
			max = Math.max(max, sum[i]);
		}

		return max;
	}
}

public class Test {

	/* Calculates the GCD of two numbers */
	public static int GCD(int a, int b) {
		if (b == 0)
			return a;
		else
			return GCD(b, a % b);

	}

	/* returns first n Fibinacci numbers */
	public static void fibbonacci(int n) {
		int a = 0;
		int b = 1;
		System.out.print(a + " ");
		System.out.print(b + " ");
		for (int i = 2; i < n; i++) {
			int c = a + b;
			a = b;
			b = c;
			System.out.print(c + " ");
		}
	}

	public static void main(String args[]) {
		// System.out.println(GCD(24, 16));
		// fibbonacci(5);
		String test = "Nachiket";
		System.out.println(test.charAt(test.length() - 1) + test.substring(0, test.length() - 1));
		int n = 10;
		System.out.println(Integer.parseInt(n + "") * 10);
	}
}
