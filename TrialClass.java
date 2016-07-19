
public class TrialClass {

	public static int[] swapMinMax(int arr[]) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, minInd = Integer.MAX_VALUE, maxInd = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
				minInd = i;
			}
			if (arr[i] > max) {
				max = arr[i];
				maxInd = i;
			}
		}
		int temp = arr[minInd];
		arr[minInd] = arr[maxInd];
		arr[maxInd] = temp;
		return arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = { 1, 7, 3, 8, 3, 4, 10, -2 };
		a = swapMinMax(a);
		String name = "	 * Method to find the number in the array equal to the number that is being";
		name.trim();
		System.out.println(name.contains("*/"));
	}
}
