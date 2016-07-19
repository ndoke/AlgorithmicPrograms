import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
	FileInputStream fis;
	ObjectInputStream ois;

	public ReadObject() {
		// TODO Auto-generated constructor stub
		try {
			fis = new FileInputStream("C:\\Users\\Nachiket\\workspace\\Testa\\src\\obj.txt");
			ois = new ObjectInputStream(fis);
			try {
				Book temp = (Book) ois.readObject();
				System.out.println("From file:" + temp);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				ois.close();
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ReadObject();
	}

}
