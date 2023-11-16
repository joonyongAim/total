package 예외처리;

public class CustomException extends Exception {
	
	public CustomException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
