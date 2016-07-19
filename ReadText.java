import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadText {
	public static void main(String args[]) throws IOException {
		String pathname = "C:\\Users\\Nachiket\\workspace\\Testa\\src\\BinarySearch.java";
		String writePathname = "C:\\Users\\Nachiket\\workspace\\Testa\\src\\Data.txt";
		File file = new File(pathname);
		File writeFile = new File(writePathname);
		try {
			BufferedReader br = new BufferedReader(new FileReader(file));
			BufferedWriter bw = new BufferedWriter(new FileWriter(writeFile));
			FileInputStream fis = new FileInputStream(file);
			FileOutputStream fos = new FileOutputStream(writeFile);
			String line;
			boolean flag = false;
			int i;
			//Using FileRead and FileWrite 
			while((i = fis.read()) != -1){
				fos.write(i);
			}
			fis.close();
			fos.close();
			//Using BufferedRead and BufferedWrite
			while ((line = br.readLine()) != null) {
				bw.write(line);
				String temp = line.trim();
				if (temp.length() >= 2 && temp.substring(0, 2).equals("/*"))
					flag = true;

				if (temp.length() >= 2 && temp.substring(0, 2).equals("//"))
					System.out.println(temp);
				else if (flag) {
					System.out.println(temp);
					if (temp.contains("*/"))
						flag = false;
				}
			}
			bw.close();
			br.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
