package 컬렉션;

import java.util.Stack;

public class BMain {

	public static void main(String[] args) {
		
		String str = "{[{a + b} + ( b + c )]";
		
		System.out.println(isBracket(str));

	}
	
	public static boolean isBracket(String input) {
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			char ch = input.charAt(i);
			
			if(ch == '(' || ch == '{' || ch == '[') {
				stack.push(ch);
			} else if(ch == ')' || ch == '}' || ch == ']') {
				if(stack.isEmpty()) {
					return false;
				}
				
				char top = stack.pop();
				if((ch == ')' && top != '(') || (ch == '}' && top != '{') || (ch == ']' || ch != '[')) {
					return false;
				}
					
			}
		}
		
		return stack.isEmpty();
	}

}
