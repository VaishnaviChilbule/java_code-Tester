package Tester;
import code.BankAccount;
import java.util.Scanner;
public class BankAccountTest {

	public static void main(String[] args)
	{
		//BankAccount bobj;
		//System.out.println(bobj);
		Scanner sc=new Scanner(System.in);
		BankAccount[] BAarr=new BankAccount[10];
		int choice=0,index=0;
		do {
		System.out.println("enter your choice:\n"+"1:Create Account\n"+"2:Show Details\n"+"3:Withdraw Amount\n"+"4:Deposite Amount\n"+"5:Apply for Locker");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			if(index<BAarr.length) {
				System.out.println("enter bank details:id,name,balance");
				BankAccount bobj1=new BankAccount(sc.nextInt(),sc.next(),sc.nextDouble());
				BAarr[index]=bobj1;
				index++;
				System.out.println("bank account created");
				}
			else
				System.out.println("please try after some time");
			break;
		case 2:
			System.out.println("enter the accid:");
			int new_id=sc.nextInt();
			for(int i=0;i<index;i++) {
				if (BAarr[i]!=null) {
				if(BAarr[i].getAccid()==new_id) {
					System.out.println(BAarr[i].toString());
					index++;}
				}
			}
			break;
		case 3:
			System.out.println("enter the accid:");
			int new_id1=sc.nextInt();
			for(int i=0;i<BAarr.length;i++) {
				if((BAarr[i]!=null)&&(BAarr[i].getAccid()==new_id1)) {
					System.out.println("enter the amount for withdraw:");
					BAarr[i].withdraw(sc.nextDouble());
					System.out.println("amount withdraw successfully");
				}
			}
			
			break;
		case 4:
			System.out.println("enter the accid:");
			int new_id2=sc.nextInt();
			for(int i=0;i<index;i++) {
				if((BAarr[i]!=null)&&(BAarr[i].getAccid()==new_id2)) {
					System.out.println("enter the amount to deposite:");
					BAarr[i].deposite(sc.nextDouble());
					System.out.println("amount deposited successfully");
					index++;
				}
			}
			break;
		case 5:
			for(int i=0;i<index;i++) {
			System.out.println("Do You Want To Apply For Locker?(Yes/No)");
			String choice1 = sc.next();
			if (choice1.equals("Yes")) {
				System.out.println("Apply For Locker");
				System.out.println("Locker Id Months");
				BAarr[i].applyLocker(sc.nextInt(),sc.nextInt());
				System.out.println(BAarr[i]);
				index++;
				
			} else
			{
				System.out.println("No Locker");
			}
			}
			break;
		}
		}while(choice<=5);
		
	}

}
