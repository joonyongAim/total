package Practice;

import java.util.Scanner;

public class GradeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("최대 정원 : ");
		Grade g = new Grade(sc.nextInt());
		
		while(true) {
			System.out.println("1.학생추가 2.학생 전체 목록 3.특정 학생 조회 4. 특정 학생 삭제 0.종료");
			int choice = sc.nextInt();
			
			if(choice == 0)
				break;
			
			switch(choice) {
				case 1:
					System.out.print("학번 입력 : ");
					String studentId = sc.next();
					System.out.print("이름 입력 : ");
					String name = sc.next();
					System.out.print("성적 개수 : ");
					int cnt = sc.nextInt();
					
					int[] scores = new int[cnt];
					for(int i=0; i<cnt; i++) {
						System.out.print(i+1+"번 성적 입력 : ");
						scores[i] = sc.nextInt();
					}		
					
					Student s = new Student(studentId, name, scores);
					g.addStudent(s);
					
					break;
					
				case 2:
					g.getAllStudents();
					
					break;
				
				case 3:
					System.out.print("학번 입력 : ");
					studentId = sc.next();
					g.searchStudent(studentId);
					
					break;
					
				case 4:
					System.out.print("학번 입력 : ");
					studentId = sc.next();
					g.removeStudent(studentId);
					
					break;
				
					
				
					
			}
		}
		

	}

}
