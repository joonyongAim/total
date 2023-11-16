package 컬렉션;

import java.util.LinkedList;
import java.util.Queue;

public class MsgMain {

	public static void main(String[] args) {
		
		Queue<Message> msg = new LinkedList<>();
		
		msg.offer(new Message("Mail", "홍길동")); // 1
		msg.offer(new Message("SMS", "둘리"));   // 2
		msg.offer(new Message("Kakao", "또치")); // 3
		
		while(!msg.isEmpty()) {
			Message m = msg.poll();
			System.out.println(m.command + "전송 : " + m.to);
		}
	
	}

}
	
class Message {
	String command;
	String to;
	
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
