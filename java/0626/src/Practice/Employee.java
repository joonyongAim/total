package Practice;

public class Employee {
	
	String name;
	int salary;
	
	
	public Employee(String name , int salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public int calcBonus() {
		return (int)(salary * 0.05);
	}

}
