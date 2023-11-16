package 쓰레드;

import java.util.ArrayList;

class Table {
	String[] dishNames = { "donut", "donut", "burger" };
	final int MAX_FOOD = 6;
	private ArrayList<String> dishes = new ArrayList<>();
	
	public synchronized void add(String dish) {
		
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName();
			System.out.println(name + " is waiting....");
			try {
				wait();
				Thread.sleep(500);
			} catch (Exception e) {
			}
		} // while 종료
		
		dishes.add(dish);
		notify();
		System.out.println("Dishes : " + dishes);
		
//		if(dishes.size() >= MAX_FOOD)
//			return;
//		
//		dishes.add(dish);
//		System.out.println("Dishes : " + dishes.toString());
	}
	
	public void remove(String dishName) {
		synchronized (this) {
			String name = Thread.currentThread().getName();
			
			while(dishes.size() == 0) {
				System.out.println(name + " is waiting");
				try {
					wait();
					Thread.sleep(500);
				} catch (Exception e) {
				} // catch 종료
			} // while 종료
			
		while(true) {
			for(int i=0; i<dishes.size(); i++) {
				if(dishName.equals(dishes.get(i))) {
					dishes.remove(i);
					notify();
					return;
				}
			} // for 종료
			
			try {
				System.out.println(name + " is waiting...");
				wait();
				Thread.sleep(500);
			} catch(Exception e) { }
			
		} // while 종료
	
	} // synchronized 종료
		
		
 } // remove메서드 종료
	
	public int dishNum() {
		return dishNames.length;
	}
}

class Cook implements Runnable {
	
	private Table table;
	
	Cook(Table table) {
		this.table = table;
	}

	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			table.add(table.dishNames[idx]);
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
		}
	}
}

class Customer implements Runnable {
	
	private Table table;
	private String food;
	
	public Customer(Table table, String food) {
		this.table = table;
		this.food = food;
	}
	
//	boolean eatFood() {
//		return 
//	}

	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			} catch (Exception e) {
			}
			
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
//					
//			if(eatFood()) {
//				System.out.println(name + " ate a " + food);
//			} else {
//				System.out.println(name + " failed to eat. :(");
//			}
		}
		
	}
	
}

public class Sample02 {

	public static void main(String[] args) throws InterruptedException {
		
		Table table = new Table();
		
		new Thread(new Cook(table), "Cook").start();
		new Thread(new Customer(table, "donut"), "손님1").start();
		new Thread(new Customer(table, "burger"), "손님2").start();
		
		Thread.sleep(5000);
		System.exit(0);

	}

}
