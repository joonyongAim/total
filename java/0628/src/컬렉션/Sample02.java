package 컬렉션;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Sample02 {

	public static void main(String[] args) {
		
		Stack<Integer> stack = new Stack<>();
		Queue<Integer> queue = new LinkedList<>();
		
		stack.push(1);
		stack.push(2);
		stack.push(3);
		
		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		
		System.out.println("==스택==");
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		System.out.println("==큐==");
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
		
		
		

	}

}
