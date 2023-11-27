//1. Create a class Person with data members as name, age, city. Write getters and setters for all the data 
//members. Also add the display function.Inside tester class invoke all the methods in that class.
package assignment_2;

public class Person {
	 private String name;
	 private int age;
	 private String city;
	public Person() {
		super();
		this.name = "vaishnavi";
		this.age = 27;
		this.city = "pune";
	}
	public Person(String name, int age, String city) {
		super();
		this.name = name;
		this.age = age;
		this.city = city;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	public void displayInfo() {
		System.out.println("   Name:"+name+"\n"+
		           "   age: "+age+"\n"+
		           "   city: "+city);
		           }
	public void displayInfo(String nm,int ag,String ct) {
		System.out.println("   Name:"+name+"\n"+
		           "   age: "+age+"\n"+
		           "   city: "+city);
		           
}
}
