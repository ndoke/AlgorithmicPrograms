import java.util.Arrays;

public class SumElementsTwoArrays {

	public static void main(String[] args) {
		int a[] = { 5, 1, 3, 2, 4 };
		int b[] = { 9, 6, 10, 7, 8 };

		// sort the arrays
		Arrays.sort(a);
		Arrays.sort(b);

		// loop through them taking the maximum products
		int maxProdSum = 0;
		for (int i = 0; i < a.length; i++)
			maxProdSum += a[i] * b[i];
		
		System.out.println(maxProdSum);
	}

}
