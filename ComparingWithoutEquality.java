
public class ComparingWithoutEquality {

	static int findMax(int x, int y) {
		return x ^ y;
	}

	public static void main(String[] args) {
		System.out.println(findMax(9, 8));
	}

}
