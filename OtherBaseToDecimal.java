import java.util.Scanner;

public class OtherBaseToDecimal {

	public static boolean isInteger(String str) {
		if (str == null) {
			return false;
		}
		int length = str.length();
		if (length == 0) {
			return false;
		}
		int i = 0;
		if (str.charAt(0) == '-') {
			if (length == 1) {
				return false;
			}
			i = 1;
		}
		for (; i < length; i++) {
			char c = str.charAt(i);
			if (c < '0' || c > '9') {
				return false;
			}
		}
		return true;
	}

	public static int convert(String n, int base) {
		if (base <= 10 && !isInteger(n))
			return -1;

		if (n.contains(base + ""))
			return -1;

		int retValue = 0;
		for (int i = n.length() - 1; i > -1; i--) {
			int temp = 0;
			switch (n.charAt(i)) {
			case 'A':
				temp = 10;
				break;

			case 'B':
				temp = 11;
				break;

			case 'C':
				temp = 12;
				break;

			case 'D':
				temp = 13;
				break;

			case 'E':
				temp = 14;
				break;

			case 'F':
				temp = 15;
				break;

			default:
				temp = Character.getNumericValue(n.charAt(i));
				break;
			}
			retValue += temp * Math.pow(base, n.length() - i - 1);
		}
		return retValue;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		String n = sc.next();
		System.out.println("Enter it's base");
		int base = sc.nextInt();
		sc.close();
		System.out.println(convert(n, base));
	}
}
