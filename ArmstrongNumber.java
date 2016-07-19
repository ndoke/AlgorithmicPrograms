import java.util.Scanner;

public class ArmstrongNumber {

	public boolean isArmstrong(long num) {
		String temp = Long.toString(num);
		long sum = 0;
		for (int i = 0; i < temp.length(); i++) {
			sum += Math.pow(Long.parseLong(temp.charAt(i) + ""), 3);
		}

		if (sum == num)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		System.out.println(new ArmstrongNumber().isArmstrong(num));
	}

}
