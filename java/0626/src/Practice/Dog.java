package Practice;

public class Dog extends Animal{
	
	String breed;
	
	public Dog(String name, String breed) {
		this.name = name;
		this.breed = breed;
	}

	@Override
	public void makeSound() {
		System.out.println("멍멍");
	}

}
