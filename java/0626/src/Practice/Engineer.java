package Practice;

public class Engineer extends Employee{
	
	public Engineer(String name, int salary) {
		super(name,salary);
	}

	@Override
	public int calcBonus() {
		return (int)(salary * 0.1);
	}

	@Override
	public String toString() {
		return "Engineer [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
