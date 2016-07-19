import java.util.Arrays;

public class ZeroOneEdits {

	public boolean isZerOne(String str1, String str2) {
		char arr1[] = str1.toCharArray();
		char arr2[] = str2.toCharArray();
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		int i = 0, j = 0, count = 0;
		while (i < arr1.length && j < arr2.length) {
			if ((int) arr1[i] < (int) arr2[j]) {
				i++;
				count++;
			} else if ((int) arr1[i] > (int) arr2[j]) {
				j++;
				count++;
			} else {
				i++;
				j++;
			}
		}
		count = count + (arr1.length - i) + (arr2.length - j);
		if (count <= 1 && (str1.length() != str2.length()) || count <= 2 && (str1.length() == str2.length()))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ZeroOneEdits zoe = new ZeroOneEdits();
		System.out.println(zoe.isZerOne("pale", "ple"));
		System.out.println(zoe.isZerOne("pales", "pale"));
		System.out.println(zoe.isZerOne("pale", "bale"));
		System.out.println(zoe.isZerOne("pale", "bake"));
	}

}
