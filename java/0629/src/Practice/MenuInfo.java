package Practice;

import java.util.Scanner;

public class MenuInfo {
	
	String name;
	int price;
	String group;
	String type;
	
	public MenuInfo() {
		
	}
	
	public MenuInfo(String name, int price, String group, String type) {
		this.name = name;
		this.price = price;
		this.group = group;
		this.type = type;
	}
	
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price);
		System.out.println("종류 : " + group);
		System.out.println("설명 : " + type);
	}
	
	public void scanInfo() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름 입력 : ");
		name = sc.next();
		System.out.print("가격 입력 : ");
		price = sc.nextInt();
		System.out.print("종류 입력 : ");
		group = sc.next();
		System.out.print("설명 입력 : ");
		type = sc.next();
		
		
		
	}
	

}
