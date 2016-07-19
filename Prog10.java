
public class Prog10 {

	public static int maxProfit(int[] prices) {
		if (prices.length < 1) {
			return 0;
		}

		int maxDiff = 0;
		int min = prices[0];
		int max = min;

		for (int price : prices) {
			if (price > max) {
				max = price;
				int tempDiff = max - min;
				if (tempDiff > maxDiff) {
					maxDiff = tempDiff;
				}
			} else if (price < min) {
				min = max = price;
			}
		}

		return maxDiff;
	}

	public static void main(String[] args) {
		int A[] = { 2171, 11, 123, 2366, 10, 1367 };
		System.out.println(maxProfit(A));
	}

}
