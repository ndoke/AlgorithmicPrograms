public class X {
	public static void main(String args[]) {
		String str = "DokeNachiketNachiket";
		int index = str.indexOf("Nach");
		System.out.println(index);
		str = str.substring(index + 4, str.length());
		System.out.println(str);
		index = str.indexOf("Nach");
		System.out.println(index);
	}
}