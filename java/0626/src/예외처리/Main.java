package 예외처리;

public class Main {

	public static void main(String[] args) {
		
//		try {
//			System.out.println("aaaaaa");
//			throw new Exception("예외 강제 발생");
//			System.out.println("bbbbbb");
//		} catch (Exception e) {
//			System.out.println(e.toString());
//		}
		
		try {
			div(5,0);
		} catch (Exception e) {
			System.out.println("메서드 에러" + e.getMessage());
		} finally {
			System.out.println("마지막에 다 출력됨                                                                                                                ");
		}
	}
	
	public static void div(int a, int b) throws Exception {
		try {
			System.out.println(a/b);
		} catch (Exception e) {
			System.out.println("div메서드 예외 발생");
			throw new Exception("0으로 못나눔");
		}
	}

}
