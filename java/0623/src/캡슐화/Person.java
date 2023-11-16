package 캡슐화;

public class Person {
	
	private String name;
	private int age;
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		
		if(age >= 1 && age <= 100) {
			this.age = age;
		} else {
			System.out.println("잘못입력하셨습니다.");
		}
	}
	
	public int getAge() {
		return age;
	}

}
