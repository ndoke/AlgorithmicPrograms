import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
	FileOutputStream fos;
	ObjectOutputStream os;

	public WriteObject() {
		// TODO Auto-generated constructor stub
		try {
			fos = new FileOutputStream("C:\\Users\\Nachiket\\workspace\\Testa\\src\\obj.txt");
			os = new ObjectOutputStream(fos);
			Book b1 = new Book(101, "Core java", 12.34);
			os.writeObject(b1);
			System.out.println("Object stored...");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new WriteObject();
	}

}
