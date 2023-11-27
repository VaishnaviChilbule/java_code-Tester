/*
 * 2:Create BankAccount Class with Data Members(id,name,balance)
 Create Inner class Locker inside BankAccount with id,rate,months

Create MenuDrive Program for Bank
1:Create Account
2:Show Details
3:Withdraw Amount
4:Deposite Amount
5:Apply for Locker

 */
package code;

public class BankAccount {
	private int accid;
	private String name;
	private double balance;
	public BankAccount(int id, String name, double balance) {
		super();
		this.accid = id;
		this.name = name;
		this.balance = balance;
	}
	private Locker lockerObj;
	

	
	public int getAccid() {
		return accid;
	}
	public void setAccid(int accid) {
		this.accid = accid;
	}
	public void applyLocker(int lockerid, int months) {
		this.lockerObj = new Locker(lockerid, months);

	}
	public void deposite(double amount) {
		this.balance = balance + amount;

		System.out.println("after Deposite Balance:" + balance);
	}
	public void withdraw(double amount) {
		this.balance = balance - amount;

		System.out.println("after Withdraw Balance:" + balance);
	}
	@Override
	public String toString() {
		if (lockerObj == null) {
			System.out.println("No Locker Assigned ");

			return "BankAccount [accid=" + accid + ", name=" + name + ", balance=" + balance + "]";
		}
		else
		{
			System.out.println("  Locker Assigned ");

			return "BankAccount [accid=" + accid + ", name=" + name + ", balance=" + balance + "  "+lockerObj+" ]";
		
		}
	}

	
	
	private class Locker {

		private int lockerId;
		private int rate, months;

		public Locker(int lockerid, int month) {
			rate = 1000;
			this.lockerId = lockerid;
			this.months = month;
			System.out.println("Locker Get Assigned for BankAccount:" + accid);
		}

		@Override
		public String toString() {
			return "Locker [lockerId=" + lockerId + ", Charges=" + (rate * months) + "]";
		}

	}
	

}
