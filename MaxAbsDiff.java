
class MaxAbsDiff {

	public static int modDiff(int arr[]) {
		// find maxDiff
		int maxDiff = 0;
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i] - i) > maxDiff)
				maxDiff = Math.abs(arr[i] - i);
		}

		// find minDiff
		int minDiff = 9999;
		for (int i = 0; i < arr.length; i++) {
			if (Math.abs(arr[i] - i) < minDiff)
				minDiff = Math.abs(arr[i] - i);
		}

		// return mod of maxDiff - minDiff
		return Math.abs(maxDiff - minDiff);
	}

	public static void main(String[] args) {
		// code
		// Scanner sc = new Scanner(System.in);
		// int numT = sc.nextInt();
		//
		// for (int i = 0; i < numT; i++) {
		// int n = sc.nextInt();
		// int arr[] = new int[n];
		// for (int j = 0; j < n; j++) {
		// arr[j] = sc.nextInt();
		// }
		// System.out.println(modDiff(arr));
		// }
		// sc.close();

		int a[] = { 468, 335, 501, 170, 725, 479, 359, 963, 465, 706, 146, 282, 828, 962, 492, 996, 943, 828, 437, 392,
				605, 903, 154, 293, 383, 422, 717, 719, 896, 448, 727, 772, 539, 870, 913, 668, 300, 36, 895, 704, 812,
				323 };
		System.out.println(modDiff(a));
	}
}