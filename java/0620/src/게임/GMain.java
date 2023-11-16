package 게임;

import java.util.Scanner;

public class GMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Behavior b = new Behavior();
		
		while(true) {
			System.out.println("1.캐릭터 삭제 2. 캐릭터 생성 3. 전체 조회");
			int choice = sc.nextInt();
			
			if(choice == 0) 
				break;
			
			switch(choice) {
				case 1:
					b.getAllJob();
					System.out.println("삭제할 캐릭터 : ");
					int index = sc.nextInt();
					
					b.removeCharacter(index-1);
					
					break;
					
				case 2:
					b.makeChar();
					
					break;
					
					
				case 3:
					b.getAll();
					
					break;
					
			}
		}
		
		
		
		
		
		
	
		
//		b.makeChar();
//		b.charInfo();
//		b.potion(0, 0, 0, 0);
		
	}

}
