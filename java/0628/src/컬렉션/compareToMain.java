package 컬렉션;

import java.util.ArrayList;
import java.util.Collections;

public class compareToMain {

	public static void main(String[] args) {
		
		ArrayList<Person> p = new ArrayList<>();
		
		p.add(new Person("aaa", 30));
		p.add(new Person("bbb", 20));
		p.add(new Person("ccc", 40));
		
		Collections.sort(p);
		
		Collections.reverse(p);
		
		for(Person t : p) {
			System.out.println(t.name + " : " + t.age);
		}

	}

}
