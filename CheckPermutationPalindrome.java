import java.util.HashMap;

public class CheckPermutationPalindrome {

	public static boolean checkPermutationPalindrome(String str) {
		// define a hashmap for storing characters
		HashMap<Integer, Integer> charCount = new HashMap<Integer, Integer>();

		// put values into the hashmap
		for (int i = 0; i < str.length(); i++) {
			// put values in the map if it doesn't contain them
			if (!charCount.containsKey((int) str.charAt(i)))
				charCount.put((int) str.charAt(i), 1);
			// if map already contains the value, increment it
			else {
				int temp = charCount.get((int) str.charAt(i));
				temp++;
				charCount.put((int) str.charAt(i), temp);
			}
		}

		// check for odd values in the hashmap
		int oddCount = 0;
		for (int x : charCount.values()) {
			if (x % 2 != 0)
				oddCount++;
			if (oddCount > 1)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		System.out.println(checkPermutationPalindrome("nihhttthhhin"));
	}

}
