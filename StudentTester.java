package assignment_2;
import java.util.Scanner;
public class StudentTester {

	public static void main(String[] args) {
		Student std=new Student();
		Scanner sc=new Scanner(System.in);
		std.displayInfo();
		Student std2=new Student(2,34,56,78);
		std2.displayInfo();
	
		

	}

}
