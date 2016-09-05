
public class DutchFlagProblem {

	public static String makeFlag(String str) {

		char[] strArr = str.toCharArray();
		int pointerStart = 0, i = 0;
		int pointerEnd = strArr.length - 1;
		while (i <= pointerEnd) {
			if (strArr[i] == 'M') {
				char temp = strArr[i];
				strArr[i] = strArr[pointerStart];
				strArr[pointerStart] = temp;
				pointerStart++;
				i++;
			} else if (strArr[i] == 'B') {
				char temp = strArr[i];
				strArr[i] = strArr[pointerEnd];
				strArr[pointerEnd] = temp;
				pointerEnd--;
			} else
				i++;
		}
		return new String(strArr);
	}

	public static void main(String[] args) {
		// String str =
		// "WBMBWMBWBWBMWBMBWMBWMBWMBWMBWMBWBMWBMWBWMBWBMWMBWMBWMBWMBWMB";
		String str = "WBMMBWBMBBBMMBWWBWBMBWMBWBWWBWBWMBMWBMWBBWMBMWBWBWBMWBMBWMBWMBBMMMMBWBBWBWBWBBBWWWWWWBBBBMMMMBBMBW";
		System.out.println(makeFlag(str));
	}

}
