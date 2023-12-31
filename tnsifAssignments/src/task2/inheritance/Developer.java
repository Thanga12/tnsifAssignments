package task2.inheritance;

public class Developer extends Employee{
	String Programming_language;
	public Developer(String name, int employee_id, double salary,String lang) {

		super(name, employee_id, salary);

		this.Programming_language=lang;
}

public String getProgramming_language() {

		return Programming_language;

	}

public void Code(){

		  System.out.println(getName()+" programming language is"+getProgramming_language());

	}

	public double bonus()

	{
      return salary*0.8;

	}

}




