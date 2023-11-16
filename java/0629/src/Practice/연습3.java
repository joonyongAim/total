package Practice;

import java.util.HashSet;
import java.util.Scanner;

public class 연습3 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		HashSet<Character> words1 = new HashSet<>();
		HashSet<Character> words2 = new HashSet<>();
		
		System.out.println("첫번째 문자열을 입력받음 : ");
		String s = sc.next();
		System.out.println("두번째 문자열을 입력받음 : ");
		String t = sc.next();
		
		for(int i=0; i<s.length(); i++) {
			words1.add(s.charAt(i));
		}
		
		for(int i=0; i<t.length(); i++) {
			words2.add(t.charAt(i));
		}
		
		System.out.println(words1);
		System.out.println(words2);
		
		HashSet<Character> resultSet= new HashSet<>();
		
		for(char c : words1) {
			if(words2.contains(c)) {
				resultSet.add(c);
			}
		}
		
		System.out.println("공통된 단어 : " + resultSet);
	}

}
