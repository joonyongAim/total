package 병원;

import java.util.Scanner;

public class ClientMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("======종합검진 EMR======");
		System.out.print("등록할 수검자 수: ");
		Medical m = new Medical(sc.nextInt());
		System.out.println();
		
		
		int pack;
		
		while(true) {
			System.out.println("[1]예약  [2]취소  [3]검사  [4]결과지 출력");
			System.out.print("[5]개별조회  [6]전체조회  [0]종료   ");
			int choice = sc.nextInt();
			System.out.println();
			
			if(choice ==0)
				break;
		switch(choice) {
			case 1:
				if(m.numClient == m.clients.length) {
			          System.out.println("🚫 더이상 추가할수 없습니다 🚫");
			          System.out.println();
			    break;   
				}
				
				System.out.println("[ 건강검진 수검자 예약 ]");
				System.out.print("▶ 예약시간을 입력하세요: ");
				int time = sc.nextInt();
				System.out.print("▶ 이름을 입력하세요: ");
				String name = sc.next();
				System.out.print("▶ 예약 번호를 입력하세요: ");
				int id = sc.nextInt();			
				System.out.print("▶ 성별을 입력하세요: ");
				String gender = sc.next();
				System.out.print("▶ 나이를 입력하세요: ");
				int age = sc.nextInt();
				System.out.print("▶ 검진 패키지 [0]기본 [1]실버 [2]골드 : ");
				int pkg = sc.nextInt();
				Client c = new Client(time,name,id, gender,age , pkg);
				m.addClient(c);
				System.out.println();
				break;
			
			case 2:
				System.out.println("[ 건강검진 수검자 취소 ]");
				System.out.print("▶ 취소할 수검자 예약번호를 입력하세요: ");
				id = sc.nextInt();
				m.subClient(id);
				System.out.println();
				break;
				
			case 3:
				System.out.println("[ 건강검진 검사지 입력 ]");
				System.out.print("▶ 수검자 예약번호: ");
				id=sc.nextInt();
				m.MedicalPack(id); 	
				System.out.println();
				break;
				
			case 4:
				System.out.println("[ 건강검진 검사지 출력 ]");
				System.out.print("▶ 수검자 예약번호:");
				id = sc.nextInt();
				m.result(id);
				System.out.println();
				break;
				
			case 5:
				System.out.println("[ 건강검진 수검자 조회 ]");
				System.out.print("▶ 수검자 예약번호:");
				id = sc.nextInt();
				m.getClientuinfo(id);
				System.out.println();
				break;
				
			case 6:
				System.out.println("[ 건강검진 전체 조회 ]");				
				m.getAllClients();
				System.out.println();
				break;
			}
		}
	

	}
}