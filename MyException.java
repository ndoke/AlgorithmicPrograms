public class MyException {
	public static void main(String[] a) {
		try {
			new MyException().myTest(null);
		} catch (MyAppException mae) {
			System.out.println("Inside catch block: " + mae.getMessage());
		}
	}

	public void myTest(String str) throws MyAppException {
		if (str == null) {
			throw new MyAppException("String val is null");
		}
	}
}

@SuppressWarnings("serial")
class MyAppException extends Exception {

	private String message = null;

	public MyAppException(String message) {
		super(message);
		this.message = message;
	}

	@Override
	public String getMessage() {
		return message;
	}
}
