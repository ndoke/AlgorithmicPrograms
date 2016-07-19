
public class UniqueCharString {

	public boolean testUniqueChar(String str) {
		// TODO Auto-generated constructor stub
		for (int i = 0; i < str.length(); i++) {
			char temp = str.charAt(i);
			String rem = str.substring(0, i) + str.substring(i + 1, str.length());
			if (rem.contains(temp + "")) {
				return false;
			}
		}
		return true;
	}
	
	public boolean testUniqueCharAlt1(String str) {
		if(str.length() > 128)
			return false;
		
		boolean[] charSet = new boolean[128];
		for(int i = 0; i < str.length(); i++){
			int temp = (int) str.charAt(i);
			if(charSet[temp])
				return false;
			charSet[temp] = true;
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharString uc = new UniqueCharString();
		boolean result = uc.testUniqueCharAlt1("cbdsaA=");
		System.out.println(result);
	}

}
