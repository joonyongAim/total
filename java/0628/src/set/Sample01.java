package set;

import java.util.Arrays;
import java.util.HashSet;

public class Sample01 {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<>();
		
		System.out.println(set.add("aaa"));
		set.add("bbb");
		set.add("ccc");
		
		set.addAll(Arrays.asList("dd","ff"));
		
		set.remove("bbb");
		
		System.out.println(set);
		

	}

}
