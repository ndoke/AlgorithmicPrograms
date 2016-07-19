import java.util.ArrayList;

public class Prog4b {

	public int finMaxZero(String str) {
		ArrayList<Integer> start = new ArrayList<Integer>();
		ArrayList<Integer> end = new ArrayList<Integer>();

		if (str.charAt(0) == '0')
			start.add(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == '0' && str.charAt(i - 1) == '1')
				start.add(i);
		}
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) == '0' && str.charAt(i + 1) == '1')
				end.add(i);
		}
		if ((str.charAt(str.length() - 1)) == '0')
			end.add(str.length() - 1);

		int maxDiff = 0;
		for (int i = 0; i < start.size(); i++) {
			int tempDiff = end.get(i) - start.get(i) + 1;
			if (tempDiff > maxDiff)
				maxDiff = tempDiff;
		}

		return maxDiff;
	}

}
