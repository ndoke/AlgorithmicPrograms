import java.util.HashMap;

public class StringPermPalin {

	public boolean strPal(String str) {
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for (int i = 0; i < str.length(); i++) {
			if (hm.containsKey(str.charAt(i))) {
				int temp = hm.get(str.charAt(i));
				temp++;
				hm.put(str.charAt(i), temp);
			} else {
				hm.put(str.charAt(i), 1);
			}
		}
		int count = 0;
		for (int x : hm.values()) {
			if (x % 2 != 0)
				count++;
		}

		if (count <= 1)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPermPalin spp = new StringPermPalin();
		String str = "N a c h N a c h x ";
		System.out.println(spp.strPal(str.replaceAll("\\s+", "")));
	}

}
