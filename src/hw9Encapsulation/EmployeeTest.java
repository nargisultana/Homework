package hw9Encapsulation;

public class EmployeeTest {

	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setName("Nargis");
		employee.setAge(25);
		employee.setSex('F');
		employee.setUsCitizen(false);

		System.out.println("My Employee name is: " + employee.getName() + "\nMy Employee age is: " + employee.getAge()
				+ "\nMy Employee sex is: " + employee.getSex() + "\nIs Employee US Citizen? "
				+ employee.getUsCitizen());
	}

}