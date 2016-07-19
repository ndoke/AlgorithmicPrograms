import java.util.HashMap;

public class OneStrPermOfAnother {

	public boolean checkPerm(String str1, String str2) {
		HashMap<Character, Integer> charCount = new HashMap<Character, Integer>();
		for (int i = 0; i < str1.length(); i++) {
			if (!charCount.containsKey(str1.charAt(i)))
				charCount.put(str1.charAt(i), 1);
			else {
				int temp = charCount.get(str1.charAt(i));
				temp++;
				charCount.put(str1.charAt(i), temp);
			}
		}

		for (int i = 0; i < str2.length(); i++) {
			if (charCount.containsKey(str2.charAt(i))) {
				int temp = charCount.get(str2.charAt(i));
				temp--;
				charCount.put(str2.charAt(i), temp);
			} else {
				charCount.put(str2.charAt(i), 1);
			}
		}

		for (int x : charCount.values()) {
			if (x != 0)
				return false;
		}

		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OneStrPermOfAnother op = new OneStrPermOfAnother();
		System.out.println(op.checkPerm("aaC", "aCa"));
	}

}
