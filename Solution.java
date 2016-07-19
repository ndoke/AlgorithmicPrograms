import java.util.*;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n1 = in.nextInt();
		int n2 = in.nextInt();
		int n3 = in.nextInt();

		int sum1 = 0;
		ArrayList<Integer> h1List = new ArrayList<Integer>();
		for (int h1_i = 0; h1_i < n1; h1_i++) {
			h1List.add(in.nextInt());
			sum1 += h1List.get(h1_i);
		}

		int sum2 = 0;
		ArrayList<Integer> h2List = new ArrayList<Integer>();
		for (int h2_i = 0; h2_i < n2; h2_i++) {
			h2List.add(in.nextInt());
			sum2 += h2List.get(h2_i);
		}

		int sum3 = 0;
		ArrayList<Integer> h3List = new ArrayList<Integer>();
		for (int h3_i = 0; h3_i < n3; h3_i++) {
			h3List.add(in.nextInt());
			sum3 += h3List.get(h3_i);
		}
		in.close();

		while (sum1 != sum2 && sum2 != sum3 && sum3 != sum1) {
			if (sum1 > sum2 && sum1 > sum3 && sum2 >= sum3) {
				sum1 -= h1List.get(0);
				h1List.remove(0);
			} else if (sum2 > sum1 && sum2 > sum3 && sum1 >= sum3) {
				sum2 -= h2List.get(0);
				h2List.remove(0);
			} else if (sum3 > sum1 && sum3 > sum2 && sum2 >= sum1) {
				sum3 -= h3List.get(0);
				h3List.remove(0);
			} else if (sum1 == sum2 && sum1 > sum3) {
				sum1 -= h1List.get(0);
				h1List.remove(0);
				sum2 -= h2List.get(0);
				h2List.remove(0);
			} else if (sum2 == sum3 && sum2 > sum1) {
				sum2 -= h2List.get(0);
				h2List.remove(0);
				sum3 -= h3List.get(0);
				h3List.remove(0);
			} else if (sum1 == sum3 && sum1 > sum2) {
				sum1 -= h1List.get(0);
				h1List.remove(0);
				sum3 -= h3List.get(0);
				h3List.remove(0);
			}
		}

		System.out.println(sum1);
	}
}
