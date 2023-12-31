package task2.inheritance;

public class Manager extends Employee {
int teamsize;

	

	

	public Manager(String name, int employee_id, double salary,int teamsize) {

		super(name, employee_id, salary);

		this.teamsize=teamsize;

	}
	public int getTeamsize() {

		return teamsize;

	}









	public void reporting(){

		         System.out.println(getName()+"reporting time is 9.30" +"team size is"+getTeamsize());

	}

	public double bonus()

	{

		

		return salary*0.10;

	}

	

	

}
