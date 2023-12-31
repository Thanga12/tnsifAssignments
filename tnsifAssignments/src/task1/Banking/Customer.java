package task1.Banking;

public class Customer {
	public static void main(String[] args)
	{
	int accNo=0;
	String name="";
	int balance=0;
	Bank u1=new Bank();
	u1.accounno=101;
	u1.name="Thanga";
	u1.balanc=20000;
	Bank u2=new Bank();
	u2.accounno=102;
	u2.name="Meena";
	u2.balanc=40000;
	u1.deposit(2000);
	u2.deposit(1000);
	u1.withdrawal(200);
	u2.withdrawal(100);
	u1.printdetails();
	u2.printdetails();
	
	
	
	}
	
	
	
	}




