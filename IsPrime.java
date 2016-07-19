import java.util.HashMap;

public class IsPrime {

	public boolean isPrime(int num) {
		int count = 0;
		for (int i = 1; i <= Math.sqrt(num); i++) {
			if (num % i == 0)
				count++;
		}
		if (count >= 2)
			return false;
		else
			return true;
	}

	public boolean isPalindrome(String str) {
		for (int i = 0; i < str.length(); i++) {
			String temp = str.charAt(i) + "";
			if (!temp.equals(str.charAt(str.length() - 1 - i) + ""))
				return false;
		}
		return true;
	}

	public boolean isNewPanagram(String str) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
//		for (int i = 65; i <= 90; i++) {
//			hm.put(i, 0);
//		}
		for (int i = 97; i <= 122; i++) {
			hm.put(i, 0);
		}

//		for (int i = 0; i < str.length(); i++) {
//			int temp = (int) str.charAt(i);
//			temp++;
//		}
		for (int x : hm.values()) {
			if (x != 1)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new IsPrime().isPrime(4));
		System.out.println(new IsPrime().isPalindrome("saxas"));
		System.out.println(new IsPrime().isNewPanagram("abcdefghijklmnopqrstuvwxyz"));
	}

}
