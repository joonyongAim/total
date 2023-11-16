package 컬렉션;

import java.util.Iterator;
import java.util.TreeSet;


public class FruitMain {

	public static void main(String[] args) {
		
		TreeSet<Fruit> f = new TreeSet<>(new DescComparator());
		
		f.add(new Fruit("수박", 5000));
		f.add(new Fruit("딸기", 3000));
		f.add(new Fruit("포도", 10000));
		
		Iterator<Fruit> it = f.iterator();
		
		while(it.hasNext()) {
			Fruit fruit = it.next();
			System.out.println(fruit.name + " : " + fruit.price);
		}
	
	}

}
