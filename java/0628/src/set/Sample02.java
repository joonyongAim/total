package set;

import java.util.HashSet;

public class Sample02 {

	public static void main(String[] args) {
		
		HashSet<Integer> lotto = new HashSet<>();
		
		for(int i=0; lotto.size() < 6; i++) {
			int num = (int)(Math.random() * 45) + 1;
			lotto.add(num);
		}
		
		System.out.println(lotto);

	}

}
