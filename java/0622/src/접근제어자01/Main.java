package 접근제어자01;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.name = "aaa";
		animal.age = 30;
		
//		animal.name = "ㅁㅁㅁ";
		animal.setName("밤비");
		
//		System.out.println(animal.name);
		System.out.println(animal.getName());
		System.out.println(animal.age);
	}

}
