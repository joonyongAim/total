package 컬렉션;

public class Person implements Comparable<Person>{
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	@Override
	public int compareTo(Person o) {
		
		return this.age - o.age;
	}
	
	
	
}
