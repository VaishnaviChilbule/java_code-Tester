//2. Create a class Date with data members as dd, mm, yy. Write getters and setters for all the data members. Also add the display function.  Create the 
//object of this class in main method and invoke all the methods in that class. 

package ass2;

public class DateTester {

	public static void main(String[] args) {
		Date dobj=new Date();
		dobj.displayDate();
		
		Date dobj2=new Date(26,07,1995);
		dobj2.displayDate();
		Date dobj3=new Date(26,7,1987);
		dobj3.displayDate();
		dobj3.setMonth(9);
		dobj3.displayDate();
		
		
	}

}
