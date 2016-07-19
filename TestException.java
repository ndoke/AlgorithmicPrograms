
public class TestException {

	public static void main(String[] args) {
		try {
			int a = 5, b = 4;
			if (a + b > 8)
				throw new WrittenException("Lavde lagle!");
		} catch (WrittenException wre){
			System.out.println(wre.getErrMssg() + " ata bas bomblat!");
		}
	}

}

@SuppressWarnings("serial")
class WrittenException extends Exception {
	String errMssg = null;

	public String getErrMssg() {
		return errMssg;
	}

	public WrittenException(String errMssg) {
		this.errMssg = errMssg;
	}

}