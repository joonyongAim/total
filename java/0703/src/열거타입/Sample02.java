package 열거타입;

public class Sample02 {

	public static void main(String[] args) {
		// values() : 열거형의 상수들을 배열로 리턴
		UserRole[] role = UserRole.values();
		
		for(int i=0; i<role.length; i++) {
			System.out.println(role[i]);
		}
		System.out.println("-----valueOf-----");
		// valueOf(String n) : n과 일치하는 상수를 리턴
		System.out.println(UserRole.valueOf("ADMIN"));
		
		UserRole n = UserRole.valueOf("ADMIN");
		UserRole n1 = UserRole.ADMIN;
		// name() : 상수를 문자열로 리턴
		System.out.println("----name()----");
		String str = n.name();
		System.out.println(str);
		
		// ordinal() : 상수의 위치를 리턴
		System.out.println("----ordinal----");
		int i = n.ordinal(); // n은 ADMIN임
		System.out.println(i);
		
		n = UserRole.GUEST;
		System.out.println("---getName---");
		n = UserRole.GUEST;
		System.out.println(n.getName());
	}

}
