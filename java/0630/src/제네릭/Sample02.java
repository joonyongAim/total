package 제네릭;

import java.util.ArrayList;
import java.util.List;

class Product {}
class Tv extends Product {}
class Audio extends Product {}

public class Sample02 {

	public static void main(String[] args) {
		
		ArrayList<Product> list1 = new ArrayList<Product>();
//		ArrayList<Product> list1 = new ArrayList<Tv>();
		List<Tv> list2 = new ArrayList<Tv>();
		
		list1.add(new Product());
		list1.add(new Tv());

	}

}
