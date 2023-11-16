package 슈퍼;

public class Child extends Parent {
	
	String gender;
	
	public Child(String name, int age, String gender) {
		super(name, age);
//		this.name = name;
//		this.age = age;
		this.gender = gender;
	}
}
