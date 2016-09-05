import java.util.Arrays;
import java.util.HashMap;

public class MinimizeStringValue {

	public static int[] retArr(String str, int k) {
		// traverse the string and put the characters and their counts in a
		// hashmap
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (!map.containsKey(str.charAt(i)))
				map.put(str.charAt(i), 1);
			else {
				int temp = map.get(str.charAt(i));
				temp++;
				map.put(str.charAt(i), temp);
			}
		}

		// put the values of the map in an array
		int result[] = new int[map.size()];
		int ind = 0;
		for (int x : map.values())
			result[ind++] = x;

		// sort the values
		result = CountingSort.sortDesc(result);

		// subtract certain values from each value (which is more than 1) of the
		// hashmap
		// for (int x : result) {
		//
		// }

		// run through the updated array and take sum of squares

		// return the array
		return result;
	}

	public static void main(String[] args) {
		System.out.println(Arrays.toString(retArr("abacdd", 2)));
	}

}
