package set;

import java.util.HashSet;
import java.util.Iterator;

public class Sample04 {

	public static void main(String[] args) {
		
		HashSet<Integer> setA = new HashSet<>();
		HashSet<Integer> setB = new HashSet<>();
		HashSet<Integer> setHab = new HashSet<>();
		HashSet<Integer> setKyo = new HashSet<>();
		HashSet<Integer> setCha = new HashSet<>();
		
		setA.add(1);	setB.add(4);
		setA.add(2);	setB.add(5);
		setA.add(3);	setB.add(6);
		setA.add(4);	setB.add(7);
		setA.add(5);	setB.add(8);
		
		System.out.println("A = " + setA);
		System.out.println("B = " + setB);
		
		Iterator<Integer> it = setB.iterator();
		while(it.hasNext()) {
			int tmp = it.next();
			if(setA.contains(tmp)) {
				setKyo.add(tmp);
			}
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			int tmp = it.next();
			if(!setB.contains(tmp)) {
				setCha.add(tmp);
			}
		}
		
		it = setA.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		it = setB.iterator();
		while(it.hasNext())
			setHab.add(it.next());
		
		System.out.println("setKyo : " + setKyo);	
		System.out.println("setCha : " + setCha);
		System.out.println("setHab : " + setHab);
		

	}
	
}
