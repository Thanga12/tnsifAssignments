 /*1. Bank Account System
 Task:

  Model a simple bank account system using classes. Create a class
BankAccount with attributes like accountNumber, accountHolder, and balance.
Include methods for deposit, withdrawal, and displaying the account
information. Create multiple instances of BankAccount to simulate different
accounts. Implement error handling to ensure the withdrawal amount does
not exceed the available balance.
  Requirements:
 Design a class to represent a bank account.
 Implement methods for deposit, withdrawal, and information display.
 Create multiple instances and demonstrate their usage.
 Handle potential errors, such as insufficient balance during withdrawals.*/

package task1.Banking;

public class Bank {
	
		String name;
		int accounno;
		int balanc;
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAccounno() {
			return accounno;
		}
		public void setAccounno(int accounno) {
			this.accounno = accounno;
		}
		public int getBalanc() {
			return balanc;
		}
		public void setBalanc(int balanc) {
			this.balanc = balanc;
		}
		public void deposit(int amount)
		{
			balanc=balanc+amount;
		}
		public void withdrawal(int amount)
		{
			if(amount> balanc)
			{
				System.out.println("Sorry,You are not having requested amount");
			}
			balanc=balanc-amount;
		}
		public void printdetails()
		{
			   System.out.println("Customer Information ");
			   System.out.println("-------------------------- ");
			   System.out.println("---------------------------- ");
			   System.out.println("Name :"+name);
			   System.out.println("Account_No :"+accounno);
			   System.out.println("Current Balance :"+balanc);
			   System.out.println("-------------------------- ");
			   System.out.println("---------------------------- ");
		}
		

}
