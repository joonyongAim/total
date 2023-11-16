package 오버라이딩;

public class Animal {
	
	String name;
	int age=5;
	
	public Animal(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

}
