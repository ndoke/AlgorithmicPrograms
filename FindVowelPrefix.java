import java.util.ArrayList;

public class FindVowelPrefix {

	public static void findPrefixVowel(String str) {
		ArrayList<Character> vowels = new ArrayList<Character>();
		vowels.add('a');
		vowels.add('e');
		vowels.add('i');
		vowels.add('o');
		vowels.add('u');
		vowels.add('A');
		vowels.add('E');
		vowels.add('I');
		vowels.add('O');
		vowels.add('U');

		if (vowels.contains(str.charAt(0)))
			System.out.println(str.charAt(0));
		else if (vowels.contains(str.charAt(1)))
			System.out.println(str.charAt(0) + "" + str.charAt(1));
		for (int i = 2; i < str.length(); i++) {
			if (vowels.contains(str.charAt(i)))
				System.out.println(str.charAt(i - 2) + "" + str.charAt(i - 1) + "" + str.charAt(i));
		}
	}

	public static void main(String[] args) {
		findPrefixVowel("Core Java programming");
	}

}
