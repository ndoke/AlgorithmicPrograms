public class X {
	private static int value;

	public class Y {
		public void showIt() {
			System.out.println("Val: " + value);
			System.out.println("Val: " + getValue());
			System.out.println("Val: " + X.getValue());
		}
	}

	public static int getValue() {
		return value;
	}
}