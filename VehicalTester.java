package ass4;
import java.util.Scanner;
public class VehicalTester {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	Vehical[] varr=new Vehical[10];
	int choice=0,index=0;
	do {
	System.out.println("enter your choice:\n"+"1:show all\n"+"2:add vehicle\n"+"3:edit price\n"+"4:edit color\n"+"5:remove\n"+"6:exit\n");
	choice=sc.nextInt();
	switch(choice) {
	case 1:
		for(int i=0;i<varr.length;i++) {
		if(varr[i]!=null)
			System.out.println(varr[i]);
		}
		break;
	case 2:
		if(index<varr.length) {
		System.out.println("enter vehical id,name,color,price");
		Vehical vobj=new Vehical(sc.nextInt(),sc.next(),sc.next(),sc.nextDouble());
		varr[index]=vobj;
		index++;
		System.out.println("vehical details is added");
		}
		break;
	case 3:
		System.out.println("enter the vehical id");
		int new_id1=sc.nextInt();
		for(int i=0;i<index;i++) {
			if(varr[i].getId()==new_id1) {
				System.out.println("vehical details is present");
				System.out.println("enter the new price");
				varr[i].setPrice(sc.nextDouble());
				System.out.println("vehical price is updated");
			}
			else
				System.out.println("vehical is not present");
		}
		
		break;
	case 4:
		System.out.println("enter the vehical id");
		int new_id=sc.nextInt();
		for(int i=0;i<index;i++) {
			if(varr[i].getId()==new_id) {
				System.out.println("vehical details is present");
				System.out.println("enter the new color");
				varr[i].setColor(sc.next());
				System.out.println("vehical color is updated");
			}
			else
				System.out.println("vehical is not present");
		}
		
		break;
	case 5:
		System.out.println("enter the vehical id");
		int new_id2=sc.nextInt();
		for(int i=0;i<index;i++) {
			if(varr[i].getId()==new_id2) {
				System.out.println("vehical details is present");
				varr[i]=null;
				System.out.println("vehical details is deleted");
			}
			else
				System.out.println("vehical is not present");
		}
		
		break;
	case 6:
		System.out.println("exiting...");
		break;
	}
	}while(choice<=6);

	}

}
