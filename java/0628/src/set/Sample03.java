package set;

import java.util.HashSet;

public class Sample03 {

	public static void main(String[] args) {
		
		HashSet<Person> set = new HashSet<>();
		
		set.add(new Person("홍길동", 20));
		set.add(new Person("둘리", 20));
		set.add(new Person("홍길동", 20));
		set.add(new Person("둘리", 20));
		set.add(new Person("둘리", 20));
		
		for(Person p : set) {
			System.out.println(p.name + " : " + p.age);
		}
		
		
		

	}

}
