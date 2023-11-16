package Test;

public class Employee {
	
	String name;
	int salary;
	String department;
	
	public void setSalary(int salary) {
		if(salary > 0)
			this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public void applyBonus(double percent) {
		salary = salary * (int)percent / 100 + salary;
		
	}
	
	public void printInfo() {
		System.out.println("Name : " + name);
		System.out.println("Salary : " + "$" + salary);
		System.out.println("Department : " + department);
	}
	

}
