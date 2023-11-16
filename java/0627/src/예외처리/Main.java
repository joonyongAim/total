package 예외처리;

public class Main {

	public static void main(String[] args) {
		try {
			int age = -10;
			setAge(age);
		} catch(CustomException e) {
			e.printStackTrace();
		}
		

	}
	
	public static void setAge(int age) throws CustomException {
		if(age < 0) {
//			throw new CustomException("나이는 음수 안됨");
		}
	}

}
