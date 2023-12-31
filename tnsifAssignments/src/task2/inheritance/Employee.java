package task2.inheritance;

public class Employee {
	String name;

	int Employee_id;

	double salary;

	

	public Employee(String name, int employee_id, double salary) {

	

		this.name = name;

		Employee_id = employee_id;

		this.salary = salary;

	}

	public String getName() {

		return name;

	}





	public int getEmployee_id() {

		return Employee_id;

	}





	public double getSalary() {

		return salary;

	}





	public double bonus()

	{

		return salary*0.05;

	}

	

}
