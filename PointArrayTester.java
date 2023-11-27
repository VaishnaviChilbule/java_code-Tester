package ass4;
import java.util.Scanner;

public class PointArrayTester {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	PointArray[] parr=new PointArray[5];
	int choice=0,index=0;
	 
	do {
		System.out.println("enter your choice:\n"+"1:show all\n"+ "2:add new" );
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			for(int i=0;i<parr.length;i++) {
				if(parr[i]!=null) {
					System.out.println(parr[i]);
				}
			}
			break;
			
		case 2:
			if (index<parr.length){
			System.out.println("enter the point co-ordinate to add:");
			int x=sc.nextInt();
			int y=sc.nextInt();
			PointArray pobj=new PointArray(x,y);
			parr[index]=pobj;
			index++;
			System.out.println("points added");
			}
			else {
				System.out.println("Array is full");
			}
			break; 
		}
		}while(choice<=2);

	}

}
