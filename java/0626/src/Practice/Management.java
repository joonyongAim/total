package Practice;

public class Management {
	
	Employee[] em = new Employee[5];
	int cnt;
	
	public void add(Employee e) {
		em[cnt] = e;
		cnt++;
	}
	
	public void totalBonus() {
		int totalBonus=0;
		for(int i=0; i<cnt; i++) {
			totalBonus += em[i].calcBonus();
		}
		
		System.out.println("총 보너스 : " + totalBonus);
	}
	
	public void info() {
		for(int i=0; i<cnt; i++) {
			System.out.println(em[i]);
		}
	}

}
