import java.util.Scanner;

public class Prog4a {

	public static String toBinary(int num) {
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

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		Prog4b pg4b = new Prog4b();
		System.out.println("Number: " + num + "\nBinary equivalent: " + toBinary(num) + "\nMax consecutive zeros: "
				+ pg4b.finMaxZero(toBinary(num)));
	}

}
