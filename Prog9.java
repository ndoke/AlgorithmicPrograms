import java.util.Arrays;

public class Prog9 {

	public static int[] rotate(int arr[], int rot) {
		if (arr.length == 0) {
			return null;
		} else {
			String str = "";
			for (int i = 0; i < arr.length; i++) {
				str = str + arr[i] + "";
			}

			for (int i = 0; i < rot; i++) {
				str = str.substring(1, str.length()) + str.charAt(0);
			}

			int retArr[] = new int[arr.length];
			for (int i = 0; i < str.length(); i++) {
				retArr[i] = Integer.parseInt(str.charAt(i) + "");
			}
			return retArr;
		}
	}

	public static void main(String[] args) {
		int arr[] = { 3, 8, 9, 7, 6 };
		System.out.println(Arrays.toString(rotate(arr, 2)));
	}

}
