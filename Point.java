//4. Create a class Point with data members as x,y. Create Default and Parameterized constructors. add the display function. Create the object of this 
//class in main method and invoke all the methods in that class. 

package ass2;

public class Point {
	private int cor_x;
	private int cor_y;
	Point() {
		super();
		this.cor_x= 0;
		this.cor_y = 0;
	}
	Point(int cor_x, int cor_y) {
		super();
		this.cor_x = cor_x;
		this.cor_y = cor_y;
	}
	
	public void display() {
		System.out.println("  cor_x: "+cor_x+"\n"+"  cor_y: "+cor_y);
		
	}
	public void display(int x1,int x2) {
		System.out.println("  cor_x: "+cor_x+"\n"+"  cor_y: "+cor_y);
		
	}


}
