package Practice;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Management m = new Management();
		
		m.add(new Manager("매니저", 5000));
		m.add(new Engineer("엔지니어", 8000));
		m.add(new SalesMan("세일즈맨", 4000));
		
		m.info();
		m.totalBonus();

	}

}
