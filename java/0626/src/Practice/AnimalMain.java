package Practice;

public class AnimalMain {

	public static void main(String[] args) {
		
//		Animal[] animals = new Animal[3];
//		
//		animals[0] = new Dog("강이지1", "푸들");
//		animals[1] = new Cat("고양이1", "치즈");
		
		
		Animal[] animals = {
				new Dog("강이지1", "푸들"),
				new Cat("고양이1", "치즈")
		};
		
		for(int i=0; i<2; i++) {
			System.out.println("이름 : " + animals[i].name);
			animals[i].makeSound();
		}
	
		

	}

}
