
public class isSubString {

	public static boolean checkIfIsSubString(String str, String sub) {

		for (int i = 0; i < str.length() - sub.length() + 1; i++) {
			int count = 0;
			for (int j = 0; j < sub.length(); j++) {
				if (str.charAt(i + j) == sub.charAt(j))
					count++;
				else
					break;
			}
			if (count == sub.length())
				return true;
		}

		return false;
	}

	public static void main(String[] args) {
		System.out.print(checkIfIsSubString("Nachiket", ""));
	}

}
