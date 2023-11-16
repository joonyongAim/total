package 상품관리;

import java.util.Scanner;

public class PMain {

	public static void main(String[] args) {
		Inventory inventory = new Inventory(10);
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1.상품추가 2.상품판매 3.전체 상품 조회 0.종료 : ");
			int choice = sc.nextInt();
			
			if(choice == 0)
				break;
			
			switch(choice) {
				case 1: // 판매할 상품정보 추가
					System.out.print("추가할 상품 아이디 : ");
					String productId = sc.next();
					System.out.print("추가할 상품명 : ");
					String name = sc.next();
					System.out.print("추가할 상품 가격 : ");
					int price = sc.nextInt();
					System.out.print("추가할 상품 재고 : ");
					int stock = sc.nextInt();
					
					Product p = new Product(productId, name, price, stock);
					inventory.addProduct(p);
					
					break;
					
				case 2:
					System.out.print("판매 상품id 입력 : ");
					productId = sc.next();
					System.out.print("판매 상품 수량 입력 : ");
					stock = sc.nextInt();
					
					inventory.sellProduct(productId, stock);
					break;
					
				case 3:
					inventory.getAllProduct();
					break;
					
				default:
					System.out.println("잘못입력하셨습니다");
			}
		}
	
	}

}
