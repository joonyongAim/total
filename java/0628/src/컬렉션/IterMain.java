package 컬렉션;

import java.util.ArrayList;
import java.util.Iterator;

public class IterMain {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bb");
		list.add("cc");
		list.add("dd");
		
		Iterator<String> it = list.iterator();
				
		while(it.hasNext()) {
			String str = it.next();
			it.remove();
			System.out.println(str);
		}
		
		System.out.println(list);
	}

}
