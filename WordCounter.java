import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WordCounter {
	public static void main(String args[]) throws IOException {
		String pathname = "C:\\Users\\Nachiket\\workspace\\Testa\\src\\Test.txt";
		File file = new File(pathname);
		int countLine = 0;
		int countWord = 0;
		int countChar = 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			FileInputStream fis = new FileInputStream(file);
			String line;
			fis.close();
			while ((line = br.readLine()) != null) {
				String parts[] = line.split(" ");
				countWord += parts.length;
				countLine++;
				countChar += line.length();
				String temp = line.trim();
				System.out.println(temp);
			}
			System.out.println("////////////////////");
			System.out.println(countLine);
			System.out.println(countWord);
			System.out.println(countChar);
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
