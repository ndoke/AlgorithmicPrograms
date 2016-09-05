
public class LargestThreeDigitPrime {

	public static void main(String[] args) {
		int numbers = 0, i = 2;
		long sum = 0l;
		while (numbers < 1000) {
			int count = 0;
			for (int j = 999; j >= i; j--) {
				if (i % j == 0)
					count++;
			}
			if (count == 2) {
				numbers++;
				sum += i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
