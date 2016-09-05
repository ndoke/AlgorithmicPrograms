import java.util.Scanner;

public class DecimalToOtherBase {

	private static String convert(int n, int base) {
		if (n == 0)
			return "0";
		else {
			// convert into the factors
			String str = "";
			while (n != 0) {
				if (n % base < 10)
					str = Integer.toString(n % base) + str;
				else {
					switch (n % base) {
					case 10:
						str += "A";
						break;

					case 11:
						str += "B";
						break;

					case 12:
						str += "C";
						break;

					case 13:
						str += "D";
						break;

					case 14:
						str += "E";
						break;

					case 15:
						str += "F";
						break;

					default:
						break;
					}
				}
				n /= base;
			}
			return str;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter decimal number");
		int n = sc.nextInt();
		System.out.println("Enter the base to which we need to convert it");
		int base = sc.nextInt();
		sc.close();
		System.out.println(convert(n, base));
	}
}
