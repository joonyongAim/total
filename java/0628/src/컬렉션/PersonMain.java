package 컬렉션;

import java.util.ArrayList;
import java.util.Comparator;

public class PersonMain {

	public static void main(String[] args) {
		
		ArrayList<Person> list = new ArrayList<>();
		
		list.add(new Person("aaa", 30));
		list.add(new Person("bbb", 20));
		list.add(new Person("ccc", 40));
		
		list.sort(Comparator.comparingInt(Person::getAge).reversed());
		
		
		for(Person p : list) {
			System.out.println(p.name + " : " + p.age);
		}

	}

}
