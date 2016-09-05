
public class FrogJump {

	public static boolean isPossible(int n) {
		if (n == 1)
			return true;
		else {
			int t = 1;
			while (t < n)
				t += t;
			if (t == n)
				return true;
			else
				return false;
		}
	}

	public static void main(String[] args) {
		int n = 64;
		System.out.println(isPossible(n));
	}

}
