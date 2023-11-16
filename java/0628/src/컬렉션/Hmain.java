package 컬렉션;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Hmain {
	
	static Queue<String> queue = new LinkedList<>();
	final static int MAX_SIZE = 5;
	
	static void save(String cmd) {
		queue.offer(cmd);
		if(queue.size() > MAX_SIZE)
			queue.poll();
	}
	
	public static void main(String[] args) {
		System.out.println("help를 입력하면 도움말을 볼 수 있습니다.");
		
		while(true) {
			System.out.print(">>");
			Scanner sc = new Scanner(System.in);
			
			String cmd = sc.next().trim();
			
			if(cmd.equalsIgnoreCase("q")) {
				System.exit(0);
			} else if(cmd.equalsIgnoreCase("help")) {
				save(cmd);
				System.out.println("help - 도움말을 보여줌");
				System.out.println("q 또는 Q - 프로그램 종료");
				System.out.println("history - 최근 입력한 명령어 " + MAX_SIZE + "개 보여줌");
			} else if(cmd.equalsIgnoreCase("history")) {
				save(cmd);
				int cnt = 0;
				
				for(String q : queue) {
					cnt++;
					System.out.println(cnt + " : " + q);
				}
			} else {
				save(cmd);
				System.out.println(cmd + "명령어 실행~~~~");
			}
		}

	}

}
