package 접근제어자01;

public class Animal {
	
	protected String name;
	protected int age;
	
	public Animal() {
	    this.name = "나비";
		this.age = 5;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

}
