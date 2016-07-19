import java.util.Arrays;
import java.util.HashMap;

public class GoogleArrayProblem {

	public static void main(String[] args) {
		int a[] = { 4, 1, 6, 3, 8 };
		int b[] = { 1, 8, 4, 6, 3 };

		int c[] = { 21, 34, 76, 46, 98 };
		int d[] = new int[c.length];

		HashMap<Integer, Integer> aPos = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> bPos = new HashMap<Integer, Integer>();
		HashMap<Integer, Integer> keyPos = new HashMap<Integer, Integer>();

		for (int i = 0; i < a.length; i++)
			aPos.put(a[i], i);

		for (int i = 0; i < b.length; i++)
			bPos.put(b[i], i);

		for (int i : aPos.keySet())
			keyPos.put(aPos.get(i), bPos.get(i));

		for (int i : aPos.keySet())
			keyPos.put(aPos.get(i), bPos.get(i));

		for (int i : keyPos.keySet())
			d[keyPos.get(i)] = c[i];

		System.out.println(Arrays.toString(d));
	}

}
