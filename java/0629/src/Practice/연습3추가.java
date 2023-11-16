package Practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class 연습3추가 {
	
	static int cnt=0;

	public static void main(String[] args) {
		
		String str1 = scanStr("첫");
		String str2 = scanStr("두");
		
		Set<Character> set1 = convert(str1);
		Set<Character> set2 = convert(str2);

		Set<Character> resultSet = eqChar(set1, set2);
		
		System.out.println(resultSet);
	}
	public static Set<Character> eqChar(Set<Character> set1, Set<Character> set2) {
		Set<Character> result = new HashSet<>();
		
		for(char c : set1) {
			if(set2.contains(c))
				result.add(c);
		}
		
		return result;
	}
	
	public static Set<Character> convert(String str) {
		Set<Character> set = new HashSet<>();
		
		for(char c : str.toCharArray()) {
			set.add(c);
		}
		
		return set;
	}
	
	public static String scanStr(String s) {
		cnt++;
		Scanner sc = new Scanner(System.in);
		System.out.println(cnt + "번째 문자열을 입력하세요");
		
		return sc.next();
		
	}

}
