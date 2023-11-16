package set;

import java.util.TreeSet;

public class Sample05 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		String from = "b";
		String to ="d";
		
		set.add("abc");set.add("alien");set.add("bat");
		set.add("car");set.add("Car");set.add("disc");
		set.add("dance");set.add("dZZZZ");set.add("dzzzz");
		set.add("elephant");set.add("elevator");set.add("fan");
		set.add("flower");
		
		System.out.println(set);
		System.out.println(set.subSet(from, "d"));
		System.out.println(set.headSet("d"));
		System.out.println(set.tailSet("d"));
		System.out.println(set.lower("d"));
		System.out.println(set.higher("d"));
		

	}

}
