import java.util.HashMap;

public class SearchMaximumDifference {

	public static void main(String[] args) {
		int a[] = { 1, 1, 3, 4, 5, 6 };
		System.out.println(searchDiff(a, 1));
	}

	private static int searchDiff(int[] a, int k) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer, Integer>();
		for (int x : a) {
			hmap.put(x, 0);
		}
		
		int count = 0;
		for(int x : a){
			if(hmap.containsKey(x + k))
				count++;
		}
		return count;
	}

}
