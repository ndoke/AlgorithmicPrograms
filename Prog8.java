import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Prog8 {

	public static void main(String args[]) throws IOException {
		String pathname = "C:\\Users\\Nachiket\\workspace\\Testa\\src\\Test.txt";
		File file = new File(pathname);
		String str = "";
		int numSent = 0, numWords = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			String line;
			while ((line = br.readLine()) != null) {
				String temp = line.trim();
				temp.trim();
				str = str + temp;
			}
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String sentances[] = str.split("\\.");
		numSent = sentances.length;
		for (String sent : sentances) {
			String parts[] = sent.split(" ");
			for (String x : parts) {
				if (!x.equals(""))
					numWords++;
			}
		}
		System.out.println("The number of sentances in the paragraph is " + numSent);
		System.out.println("The number of words in the paragraph is " + numWords);
	}
}
