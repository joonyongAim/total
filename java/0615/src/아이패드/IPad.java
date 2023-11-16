package 아이패드;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class IPad {
	
	int screen; // 화면 크기
	int color; // 색상
	int memory; // 용량
	int network; // 네트워크
	String name; // 각인 설정 시 이름 저장
	String productDate; // 생산일자
	String serialNum; // 일련번호
	static int cnt = 0; // 생산 대수
	
	Scanner sc = new Scanner(System.in);
	
	public IPad(String name) {
		this.name = name;
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyMMdd");
		productDate = sdf.format(now);
		cnt++;
		productDate = productDate + cnt;
	}
	
	// 제품 구입 여부 선택 메서드
	public boolean continueOrder() {
		System.out.println ("구매하시려면 yes, 아니면 no 입력 : ");
		String isOrder = sc.next();
		
		if(isOrder.equalsIgnoreCase("yes"))
			return true;
		else
			return false;
		}
	
	public void setScreen() {
		
		while(true) {
			System.out.println("디스플레이 선택 [1]11인치, [2]12.9인치 : ");
			screen = sc.nextInt();
		
			if(screen == 1 || screen == 2)
				return;
			
			System.out.println("잘못 입력하셨습니다.");
		}
	
	}
	
	public void setColor() {
		while(true) {
			System.out.print("색상 선택 [1]스페이스그레이 [2]실버 : ");
			color = sc.nextInt();
			
			if(color == 1 || color == 2)
				return;
			
			System.out.println("잘못 입력하셨습니다.");
		}
	}

	public void setMemory() {
		while(true) {
			System.out.println("용량 선택 [1]128GB [2]256GB [3]512GB [4]1TB : ");
			memory = sc.nextInt();
			if(memory >= 1 && memory <= 4)
				return;
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void setNetwork() {
		while(true) {
			System.out.println("네트워크 선택 [1]WIFI [2]Wifi + Cellular : ");
			network = sc.nextInt();
			if(network == 1 || network == 2)
				return;
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	
	public void setName() {
		System.out.print("각인 서비스 하시겠습니까 ? [yes/no] : ");
		String service = sc.next();
		if(service.equalsIgnoreCase("yes")) {
			System.out.println("이름 입력 : ");
			name = sc.next();
		}
	}
	
	public void setSerialNum() {
		String screenStr = (screen == 1) ? "11" : "13";
		String[] memStr = { "", "128", "256", "512", "1024" };
		String netStr = (network == 1) ? "W" : "C";
		
		serialNum = "iPad" + screenStr + memStr[memory-1] + netStr + productDate + cnt;
	}
	
	public void progress() throws Exception{
		
		int cnt = 0;
		
		while(true) {
			Thread.sleep(300);
			cnt++;
			System.out.println("제작중 입니다. [" + cnt + "%]");
			
			if(cnt>=100)
				break;
		}
	
	}
	
	public void printOrder() {
		String[] screenType = { "11인치", "12.9인치"};
		String[] colorType = { "스페이스그레이", "실버"};
		String[] memoryType = { "128GB", "256GB", "512GB", "1TB"};
		String[] networkType = { "Wifi", "Wifi + Cellular"};
		
		System.out.println("====주문 정보 출력====");
		System.out.println("화면 크기 : " + screenType[screen-1]);
		System.out.println("제품 색상 : " + colorType[color-1]);
		System.out.println("제품 용량 : " + memoryType[memory-1]);
		System.out.println("네트워크 : " + networkType[network-1]);
		System.out.println("이름 : " + name);
		System.out.println("일련번호 : " + serialNum);
	}
	
}
