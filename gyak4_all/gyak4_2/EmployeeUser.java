package gyak4_2;

import gyak4_2.Employee;


public class EmployeeUser {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.setName("Daniel Varady");
		employee.setSalary(25000);
		System.out.println(employee.getNameAndSalary());
		System.out.println(employee.getName());
		System.out.println(employee.getSalary());
		employee.addToSalary(2500);
		System.out.println(employee.getNameAndSalary());

	}
	
}
