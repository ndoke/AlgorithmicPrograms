
public class stringPerm {

	void permFind(String str, String ret) {
		if (str.equals(""))
			System.out.println(ret);
		else {
			for (int i = 0; i < str.length(); i++) {
				permFind(str.substring(0, i) + str.substring(i + 1, str.length()), str.charAt(i) + ret);
			}
		}
	}

	stringPerm(String str) {
		permFind(str, "");
	}

	public static void main(String[] args) {
		new stringPerm("abcd");
	}

}
