package Test;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "John Doe";
		employee.setSalary(50000);
		employee.setDepartment("IT");
		employee.applyBonus(10);
		employee.printInfo();
		
		

	}

}
