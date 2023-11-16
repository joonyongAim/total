package Practice;

public class SalesMan extends Employee{
	
	public SalesMan(String name, int salary) {
		super(name,salary);
	}

	@Override
	public int calcBonus() {
		return (int)(salary * 0.15);
	}

	@Override
	public String toString() {
		return "SalesMan [name=" + name + ", salary=" + salary + "]";
	}

	
	
}
