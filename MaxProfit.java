
public class MaxProfit {

	private static void getMaxProfit(int[] stockPricesYesterday) {
		int i = 0, j = 1, maxProfit = -1;
		while (i < stockPricesYesterday.length && j < stockPricesYesterday.length) {
			if (stockPricesYesterday[j] <= stockPricesYesterday[i]) {
				i = j;
				j++;
			} else {
				if (stockPricesYesterday[j] - stockPricesYesterday[i] > maxProfit)
					maxProfit = stockPricesYesterday[j] - stockPricesYesterday[i];
				j++;
			}
		}
		System.out.println(maxProfit);
	}

	public static void main(String[] args) {
		// int[] stockPricesYesterday = new int[] { 10, 7, 5, 8, 11, 9, 2, 13 };
		int[] stockPricesYesterday = new int[] { 8, 7, 6, 5, 4, 3, 2, 1 };
		getMaxProfit(stockPricesYesterday);
	}

}
