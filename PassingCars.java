
public class PassingCars {

	public static long CountPairs(int arr[]) {
		long N = 0;
		long sum = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		long tempSum = 0;
		for (int i = 0; i < arr.length; i++) {
			tempSum += arr[i];
			if (arr[i] == 0) {
				long temp = sum - tempSum;
				N += temp;
			}
		}

		if (N > 1000000000)
			return -1;
		else
			return N;
	}

	public static void main(String[] args) {
		int a[] = { 0, 1, 0, 1, 1 };
		System.out.print(CountPairs(a));
	}

}
