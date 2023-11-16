package Practice;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class 연습5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashMap<String, Integer> students = new HashMap<>();
		String name;
		int score;
		
		
		
		while(true) {
			System.out.print("학생 이름을 입력받음(종료 : exit) : ");
			name = sc.nextLine();
			
			if(name.equalsIgnoreCase("exit"))
				break;
			
			if(students.containsKey(name)) {
				System.out.println("이미 등록된 학생입니다.");
				continue;
			}
			
			System.out.print(name + "의 점수를 입력받음 : ");
			score = sc.nextInt();
			sc.nextLine();
			
			students.put(name, score);
		}
		
		System.out.println("학생 수 : " + students.size());
		
		String maxName="";
		int max = -1;
		
		for(String key : students.keySet()) {
			if(max < students.get(key)) {
				max = students.get(key);
				maxName = key;
			}
		}
		System.out.println("점수가 가장 높은 사람 : " + maxName + "(" + max + ")");
		
		int sum=0;
		double avg;
		
		Iterator<String> it = students.keySet().iterator();
		while(it.hasNext()) {
			String key = it.next();
			sum = sum + students.get(key);
		}
		avg = (double)sum / students.size();
		
		System.out.println("전체 평균 : " + avg);
	}

}
