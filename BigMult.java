import java.math.BigInteger;
import java.util.Scanner;

public class BigMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number");
		String str1 = sc.next();
		System.out.println("Enter second number");
		String str2 = sc.next();
		sc.close();
		BigInteger bi1, bi2;
		bi1 = new BigInteger(str1);
		bi2 = new BigInteger(str2);
		System.out.println(bi1.multiply(bi2));
	}

}
