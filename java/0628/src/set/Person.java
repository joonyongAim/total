package set;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	}

	@Override
	public boolean equals(Object obj) {
		
		if(!(obj instanceof Person)) {
			return false;
		}
		
		Person p = (Person) obj;
		
		return this.name.equals(p.name) && this.age == p.age;
			
			
	}
	
	
	
}
