package 제네릭;

import java.util.ArrayList;

class Fruit{ }
class Apple extends Fruit{ }
class Grape extends Fruit{ }

class Juice{ }
class Juicer {
	static void makeJuice(FruitBox<? extends Fruit> box) {
		
	}
}

class Box<T> { }
class FruitBox<T extends Fruit> extends Box<T> { }

public class Sample02 {

	public static void main(String[] args) {
		FruitBox<Fruit> fbox1 = new FruitBox<>();
		FruitBox<Apple> fbox2 = new FruitBox<>();
		FruitBox<Grape> fbox3 = new FruitBox<>();
		ArrayList<String> slist = new ArrayList<>();
		ArrayList<Apple> alist = new ArrayList<>();
		ArrayList<Grape> glist = new ArrayList<>();
		
		Juicer.makeJuice(fbox1);
		Juicer.makeJuice(fbox2);
		Juicer.makeJuice(fbox3);
		
		
		

	}

}
