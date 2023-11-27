//1:Write a program to create student class with data members rollno, marks1,mark2,mark3.
//Accept data (acceptInfo()) and display  using display member function.
//Also display total,percentage and grade.
package assignment_2;

public class Student {
	private int rollno;
	private int marks1;
	private int marks2;
	private int marks3;
	private int total;
	private double percentage;
	private String grade;
	
	Student(){
		this.rollno=0;
		this.marks1=0;
		this.marks2=0;
		this.marks3=0;
		
	}
	
	Student(int rno,int mk1,int mk2,int mk3) {
		this.rollno=rno;
		this.marks1=mk1;
		this.marks2=mk2;
		this.marks3=mk3;
		System.out.println("information is added");
		
	}
	
	public double cal_percentage() {
		total=marks1+marks2+marks3;
		percentage=total/3;
		return percentage;
		
	}
	
	public String cal_grade() {
		if (percentage>75) {
			grade="A";
			return grade;
		}
		else {
			grade="B";
			return grade;
		}
			
	}
	public void displayInfo() {
		System.out.println("   rollno: "+rollno+"\n"+
				           "   marks1: "+marks1+"\n"+
				           "   marks2: "+marks2+"\n"+
				           "   marks3: "+marks3);
	}
	
	public void displayInfo(int rno,int mk1,int mk2,int mk3) {
		System.out.println("   rollno: "+rollno+"\n"+
		                   "   marks1: "+marks1+"\n"+
		                   "   marks2: "+marks2+"\n"+
		                   "   marks3: "+marks3);
	}
}
