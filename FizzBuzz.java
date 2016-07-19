import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FizzBuzz {

	public static int findLCM(int num1, int num2) {
		int a = num1, b = num2;
		while (a != b) {
			if (a > b)
				a -= b;
			else
				b -= a;
		}

		return num1 * num2 / a;
	}

	public static void main(String[] args) throws IOException {
		File file = new File(args[0]);
		BufferedReader buffer = new BufferedReader(new FileReader(file));
		String line;
		while ((line = buffer.readLine()) != null) {
			line = line.trim();
			String parts[] = line.split(" ");
			int num1 = Integer.parseInt(parts[0]), num2 = Integer.parseInt(parts[1]), lim = Integer.parseInt(parts[2]);
			int LCM = findLCM(num1, num2);
			for (int i = 1; i <= lim; i++) {
				if (i % LCM == 0)
					System.out.print("FB ");
				else if (i % num1 == 0)
					System.out.print("F ");
				else if (i % num2 == 0)
					System.out.print("B ");
				else
					System.out.print(i + " ");
			}
			System.out.println();
		}
		buffer.close();
	}

}
