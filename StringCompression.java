import java.util.ArrayList;

public class StringCompression {

	public String strComp(String str) {
		ArrayList<String> al = new ArrayList<String>();
		al.add(str.charAt(0)+"");
		int count = 1;
		for(int i = 1; i < str.length(); i++){
			if(str.charAt(i) == str.charAt(i - 1)){
				count++;
			} else {
				al.add(count+"");
				count = 1;
				al.add(str.charAt(i)+"");
			}
		}
		al.add(count+"");
		String retStr = "";
		for(int i = 0; i < al.size(); i++){
			retStr += al.get(i);
		}
		return retStr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression sc = new StringCompression();
		System.out.println(sc.strComp("aabbbdascc"));
	}

}
