package 클래스;

public class Sample01 {

	public static void main(String[] args) {
		
		Animal cat = new Animal();
		Animal dog = new Animal();
		
		cat.name = "나비";
		cat.age = 5;
		dog.name = "밤비";
		dog.age = 3;
		
		cat.showInfo();
		dog.showInfo();
		

	}

}
