package ass2;

import java.util.Scanner;

public class ArrayTester {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n=0;
		System.out.println("enter the size of array:");
		n = sc.nextInt();
		int arr1[] = new int[n];
		System.out.println("enter array element");
		for (int i = 0; i <n; i++) {
			arr1[i] = sc.nextInt();
		}
		System.out.println("array element added");
		int choice = 0;
		Array aobj = new Array(arr1);

		do {
			System.out.println("enter your choice:\n" + 
					"1.Show Array\n" + "2.Add element\n" + "3.search element\n"
					+ "4.sortArray\n" + "5.Exit");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				aobj.show_Array(arr1);
				break;
			case 2:
				System.out.println("enter the number you want to add:");
				int num=sc.nextInt();
				aobj.addElement(n,num);
				break;
			case 3:
				System.out.println("enter element you want to search:");
				int number=sc.nextInt();
				aobj.searchElement(number);
				break;
			case 4:
				System.out.println("array after sorting:");
				aobj.sortArray();
				break;
			case 5:
				System.out.println("exiting!!!");
				break;
				
			}
		} while (choice<= 5);

	}

}
