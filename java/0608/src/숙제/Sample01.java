package 숙제;

import java.util.Scanner;

public class Sample01 {

	public static void main(String[] args) {
		
		int num; // 상품을 선택하는 번호 저장
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("====자판기 작동중====");
		while(true) {
			System.out.println("어떤 상품을 구매하시겠습니까 ?");
			System.out.println("[1]소주  [2]라면  [3]커피  [4]자판기 종료");
			num = sc.nextInt();
			
			if(num==1) {
				System.out.println("소주를 구매하셨습니다.");
			} else if(num==2) {
				System.out.println("라면을 구매하셨습니다.");
			} else if(num==3) {
				System.out.println("커피를 구매하셨습니다.");
			} else if(num==4) {
				System.out.println("자판기 종료");
				break;
			} else {
				System.out.println("잘못입력하셨습니다.");
			}
		}
	}

}
