package Practice;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		HashMap<String, MenuInfo> menu = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		
		menu.put("아이스아메리카노", new MenuInfo("아메리카노", 2000, "커피", "진함"));
		menu.put("아이스카페라떼", new MenuInfo("라떼", 2500, "커피", "연함"));
		menu.put("아이스초코", new MenuInfo("초코라떼", 3400, "초코", "보통"));
		
		while(true) {
			System.out.print("[1]메뉴보기, [2]메뉴조회, [3]메뉴추가, [4] 메뉴삭제, [5]메뉴수정 [6]종료");
			int choice = sc.nextInt();
			
			if(choice == 6)
				break;
			
			switch(choice) {
				case 1: 
					System.out.println("====전체 메뉴 조회====");
					for(String key : menu.keySet()) {
						System.out.println("메뉴 이름 : " + key);
						MenuInfo m = menu.get(key);
						m.showInfo();
					}
					break;
				case 2:
					System.out.print("메뉴조회 : ");
					String str = sc.next();
					
					MenuInfo m = menu.get(str);
					m.showInfo();
					
					break;
				case 3:
					System.out.print("메뉴추가 : ");
					String menuName = sc.next();
					
					MenuInfo addMenu = new MenuInfo();
					addMenu.scanInfo();
					
					menu.put(menuName, addMenu);
					break;
				
				case 4:
					System.out.print("메뉴삭제 : ");
					str = sc.next();
					
					menu.remove(str);
					break;
					
				case 5:
					System.out.print("메뉴수정 : ");
					menuName = sc.next();
					
					MenuInfo modifyMenu = new MenuInfo();
					modifyMenu.scanInfo();
					
					menu.put(menuName, modifyMenu);
					break;
			}
		
		
		}

	
	}

}
