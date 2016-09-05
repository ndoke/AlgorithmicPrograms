import java.util.ArrayList;
import java.util.Scanner;

public class LargestPrime {

	public static boolean isPrime(long n) {
		int count = 0;
		for (long i = 1; i <= Math.sqrt(n); i++) {
			if (n % i == 0)
				count++;
			if (count > 2)
				break;
		}
		if (count >= 2)
			return false;
		else
			return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		long num = sc.nextLong();
		sc.close();
		String temp = Long.toString(num);
		long limit = 0;
		for (int i = 0; i < temp.length(); i++) {
			limit += 9 * Math.pow(10, i);
		}
		ArrayList<Long> arl = new ArrayList<Long>();
		for (long i = 2; i < limit; i++) {
			if (isPrime(i)) {
				arl.add(i);
			}
		}
		for (int i = arl.size() - 1; i >= 0; i--) {
			if (num % arl.get(i) == 0) {
				System.out.println(arl.get(i));
				break;
			}
		}
	}

}
