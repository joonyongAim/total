package 열거타입;

public enum UserRole {
	ADMIN("관리자", 20),
	GUEST("게스트", 50);
	
	private String name;
	private int age;
	
	UserRole(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public String getName() {
		return name;
	}
	

}
