package Practice;

public class Manager extends Employee{
	
	public Manager(String name, int salary) {
		super(name,salary);
	}


	@Override
	public int calcBonus() {
		return (int)(salary * 0.2);
	}


	@Override
	public String toString() {
		return "Manager [name=" + name + ", salary=" + salary + "]";
	}
	
	
	
	
	
	

}
