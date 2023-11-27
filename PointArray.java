/*
 1.1:Create a class Point2D ,    : for representing a point in x-y co-ordinate system.

1.2 Create a parameterized constructor to initialize x & y co-ords.

1.3 Add a method toString return string form of  point's x & y co-ords

1.4 Create a tester class and test Point2D class.
1.5 Create a array to store 5 objects.Create menu driven program 
    1:show all 2:add new 

 */

package ass4;

public class PointArray {
	private int cor_x;
	private int cor_y;
	PointArray() {
		super();
		this.cor_x= 0;
		this.cor_y = 0;
	}
	PointArray(int cor_x, int cor_y) {
		super();
		this.cor_x = cor_x;
		this.cor_y = cor_y;
	}
	
	@Override
	public String toString() {
		return "PointArray [cor_x=" + cor_x + ", cor_y=" + cor_y + "]";
	}
	public int getCor_x() {
		return cor_x;
	}
	public void setCor_x(int cor_x) {
		this.cor_x = cor_x;
	}
	public int getCor_y() {
		return cor_y;
	}
	public void setCor_y(int cor_y) {
		this.cor_y = cor_y;
	}
	public void display() {
		System.out.println("  cor_x: "+cor_x+"\n"+"  cor_y: "+cor_y);
		
	}
	public void display(int x1,int x2) {
		System.out.println("  cor_x: "+cor_x+"\n"+"  cor_y: "+cor_y);
		
	}
	public void addElement(int x, int y) {
		
		
	}



}
