
public class ReplacePattern {

	public ReplacePattern(String str) {

		while (str.contains("AA") || str.contains("BB") || str.contains("CC")) {
			while (str.contains("AA")) {
				str = str.replace("AA", "A");
			}

			while (str.contains("BB")) {
				str = str.replace("BB", "B");
			}

			while (str.contains("CC")) {
				str = str.replace("CC", "A");
			}
		}

		while (str.contains("AB") || str.contains("BC") || str.contains("AC")) {
			while (str.contains("AB")) {
				str = str.replace("AB", "C");
			}

			while (str.contains("BC")) {
				str = str.replace("BC", "B");
			}

			while (str.contains("AC")) {
				str = str.replace("AC", "A");
			}
		}
		System.out.println(str);
	}

	public static void main(String[] args) {
		String str = "AAAAABBBCCCC";
		@SuppressWarnings("unused")
		ReplacePattern rp = new ReplacePattern(str);
	}

}
