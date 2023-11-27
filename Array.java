//2:Create a menu driven program for performing operations on array;
//1:Show Array
//2:Add element
//3:search element
//4:doubleArrayElement
//5:sortArray

package ass2;

import java.util.Arrays;

public class Array 
{
	private int arr[]= new int[2];

	Array(int arr[]) {
		super();
		this.arr = arr;
		
	}
	public void sortArray() {
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		
	}
	public void searchElement(int num) {
		for(int i=0;i<arr.length;i++) {
			if (arr[i]==num) 
				System.out.println("element found");
			else
				System.out.println("element not found");
			
		}
	}

	public void addElement(int n,int num1) {
		int newa[]=new int[n+1];
		for(int i=0;i<arr.length;i++) {
			newa[i]=arr[i];
			newa[n]=num1;
		}
		System.out.println("element added");
	}
	public void show_Array(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	
	

}
