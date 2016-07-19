import java.io.File;

public class FolderView {

	File file;

	public FolderView(String ext, String ext1) {
		// TODO Auto-generated constructor stub
		String path = "C:\\Users\\Nachiket\\workspace\\Testa\\src";
		file = new File(path);
		// System.out.println(file.isFile());
		// System.out.println(file.isDirectory());
		// System.out.println(file.getAbsolutePath());
		if (file.isDirectory()) {
			System.out.println("Is Dir");
			String arr[] = file.list(new Extension(ext, ext1));
			for (int i = 0; i < arr.length; i++) {
				File tempFile = new File(path + "\\" + arr[i]);
				System.out.println(arr[i] + "\t" + (tempFile.isDirectory() ? "Directory" : "File"));
			}
		} else {
			System.out.println(file.isHidden() ? "Hidden.." : "Visible");
			System.out.println(file.canWrite() ? "Writeable.." : "READ ONLY");
			System.out.println(file.length());
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FolderView(".java", ".txt");
	}

}
