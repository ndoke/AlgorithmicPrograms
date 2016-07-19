
public class URLfy {

	public String toURL(String str) {
		int numSpace = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				numSpace++;
		}
		char strCh[] = str.toCharArray();
		char retStr[] = new char[str.length() + numSpace * 2];
		int i = 0;
		for(int j = 0; j < retStr.length; j++){
			if (strCh[i] == ' '){
				i++;
				retStr[j++] = '%';
				retStr[j++] = '2';
				retStr[j] = '0';
			} else {
				retStr[j] = strCh[i++];
			}
		}
		return new String(retStr);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		URLfy url = new URLfy();
		System.out.println(url.toURL("My name is Nachiket Doke."));
		char chr[] = {'a', 'b', 'c'};
		System.out.println(new String(chr));
	}

}
