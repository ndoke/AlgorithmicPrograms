import java.util.Scanner;

public class ToBinary {

	String toBinary(int num) {
		if (num == 0)
			return "0";
		else {
			String temp = "";
			while (num > 1) {
				temp = Integer.toString(num % 2) + temp;
				num /= 2;
			}
			temp = "1" + temp;
			return temp;
		}
	}

	String onesCompliment(String str) {
		String retStr = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == '0')
				retStr += "1";
			else
				retStr += "0";
		}
		return retStr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(num + "\t" + new ToBinary().toBinary(num) + "\t"
				+ new ToBinary().onesCompliment(new ToBinary().toBinary(num)));
		for (int i = 0; i <= 100; i++) {
			System.out.println(i + "\t" + new ToBinary().toBinary(i) + "\t"
					+ new ToBinary().onesCompliment(new ToBinary().toBinary(i)));
		}

	}
//7324192577
}
