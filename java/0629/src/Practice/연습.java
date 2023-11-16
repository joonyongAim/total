package Practice;

import java.util.HashSet;
import java.util.Set;


public class 연습 {

	public static void main(String[] args) {
		
		String str = "I abc a ee I abc";
		String[] arr = str.split(" ");
		
		HashSet<String> words = new HashSet<>();
		HashSet<String> dupWords = new HashSet<>();
		
		for(String word : arr) {
			if(!words.add(word)) {
				dupWords.add(word);
			} 
		}
		
		if(dupWords.isEmpty()) {
			System.out.println("중복 단어 없음");
		} else {
			System.out.println(dupWords);
		}
		
		

	}

}
