package 컬렉션;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Sample01 {

	public static void main(String[] args) {
		
		String[] data = {"123", "145", "111"};
		ArrayList<String> al = new ArrayList<String>(Arrays.asList(data));
		
		System.out.println(al);
		
		al.sort(Comparator.naturalOrder());
		System.out.println(al);
		
		al.sort(Comparator.reverseOrder());
		System.out.println(al);
		
	}

}
