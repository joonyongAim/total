package 제네릭;

class Person<T> {
	T name;
	E age;
	public Person(T name) {
		this.name = name;
	}
	
	public E getAge() {
		return age;
	}
}

public class Sample01 {

	public static void main(String[] args) {
		
		Person<String> p1 = new Person<>("asd");
		System.out.println(p1.name);
		Person<Integer> p2 = new Person<>(1111);

	}

}
