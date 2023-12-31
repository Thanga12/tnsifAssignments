package task2.inheritance;

public class Main {
	public static void main(String[] args)

	{

		Manager m=new Manager("Thanga ",01,50000,6);

		Developer d= new Developer("Meena",02,45000,"Java");

		m.reporting();

		d.Code();

		

		 System.out.println(m.getName() + " Bonus:" + m.bonus());

		 System.out.println(d.getName() + " Bonus:" + d.bonus());

	}



}
