package 예외처리;

public class Main02 {

	public static void main(String[] args) {
		
		try {
			try {
				int result = 10/0;
			} catch (ArithmeticException e) {
				throw new CustomException("강제 발생", e);
			}
		} catch(CustomException e) {
			System.out.println("예외 발생 : " + e.getMessage());
			System.out.println("원인 : " + e.getCause().getMessage());
		}

	}

}
