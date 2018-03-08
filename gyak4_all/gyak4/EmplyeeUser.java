package gyak4;

public class EmplyeeUser {

	public static void main(String[] args) {
		
		Employee employee=new Employee();
		employee.name="Daniel Varady";
		employee.salary=25000;
		System.out.println(employee.getNameAndSalary());
		employee.addToSalary(2500);
		System.out.println(employee.getNameAndSalary());

	}

}
