
public class FindMissingNumber {

	public static int missingNumber(int arr[]) {
		int startArr = 0;
		int diff = 1;

		// calculate length
		int start = 0;
		int end = arr.length - 1;
		int midInd = 0;

		while (start < end) {
			// find middle element and middle value of the array
			midInd = (start + end) / 2;
			int temp = arr[midInd];

			// calculate the middle value by arithmetic prog
			int value = arr[startArr] + midInd * diff;

			// if the value is equal to the value calculated by arithmetic prog,
			// check second half
			if (temp == value) {
				start = midInd + 1;
			} else if (temp > value)
				// else if value is greater than the value calculated by
				// arithmetic prog, check first half
				end = midInd;

		}

		if (midInd == 0)
			return arr[midInd] + 1;
		else if (midInd == arr.length)
			return arr[midInd] - 1;
		else if (arr[midInd] - arr[midInd - 1] > 1)
			return (arr[midInd] + arr[midInd - 1]) / 2;
		else
			return (arr[midInd + 1] + arr[midInd]) / 2;

	}

	public static void main(String[] args) {
		int arr[] = { 5, 7 };
		// int arr[] = { 5, 7, 8 };
		// int arr[] = { 4, 5, 7 };
		// int arr[] = { 2, 3, 4, 5, 7, 8 };
		// int arr[] = { 2, 3, 4, 5, 7, 8, 9, 10 };
		System.out.println(missingNumber(arr));
	}

}
