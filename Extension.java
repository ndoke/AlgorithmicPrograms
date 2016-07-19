import java.io.File;
import java.io.FilenameFilter;

public class Extension implements FilenameFilter {
	String ext;
	String ext1;
	public Extension(String ext, String ext1) {
		// TODO Auto-generated constructor stub
		this.ext = ext;
		this.ext1 = ext1;
	}

	@Override
	public boolean accept(File arg0, String arg1) {
		// TODO Auto-generated method stub
		return arg1.endsWith(ext);
	}

	public boolean accept(File arg0, String arg1, String arg2) {
		// TODO Auto-generated method stub
		return arg1.endsWith(ext) || arg2.endsWith(ext1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
