package 컬렉션;

import java.util.ArrayList;

public class MenuMain {

	public static void main(String[] args) {
		
		ArrayList<MenuInfo> menu = new ArrayList<>();
		
		menu.add(new MenuInfo("아아", 2000, true));
		MenuInfo mi = new MenuInfo("뜨아", 1500, false);
		menu.add(mi);
		menu.add(new MenuInfo("라떼", 2500, true));
		
		for(int i=0; i<menu.size(); i++) {
			System.out.println(menu.get(i).name);
			System.out.println(menu.get(i).totalPrice() + "원");
		}
		
	

	}

}
