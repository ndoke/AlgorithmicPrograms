import java.util.ArrayList;
import java.util.HashMap;

public class EqnOrderFour {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al = new ArrayList<String>();
		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		for(int a = 1; a <= 1000; a++){
			for(int b = 1; b <= 1000; b++){
				int result = (int) (Math.pow(a, 3) + Math.pow(b, 3));
				al.add(result, a+", "+b);
				hm.put(a+", "+b, (int) (Math.pow(a, 3) + Math.pow(b, 3)));
			}
		}
		
		for(int c = 1; c <= 1000; c++){
			for(int d = 1; d <= 1000; d++){
				//if()
			}
		}
	}

}
