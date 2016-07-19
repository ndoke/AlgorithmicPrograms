
public class StringRotation {

	public boolean isSubstring(String str1, String str2) {
		if(str1.contains(str2))
			return true;
		else
			return false;
	}
	
	public boolean isRotation(String str1, String str2) {
		for(int i = 0; i < str2.length(); i++){
			String temp1 = str2.substring(0, i);
			String temp2 = str2.substring(i, str2.length());
			String temp = temp2 + temp1;
			if(isSubstring(str1, temp)){
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringRotation sr = new StringRotation();
		System.out.println(sr.isRotation("Nachiket", "Nachiket"));
	}

}
