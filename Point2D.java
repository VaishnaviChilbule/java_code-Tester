/*
 * 5.1 Create a class Point2D ,    : for representing a point in x-y co-ordinate system.

5.2 Create a parameterized constructor to init x & y co-ords.

5.3 Add a method to return string form of  point's x & y co-ords
Hint :  public String toString()) 
5.4 Add isEqual method to Point2D class :a boolean returning method : must return true if both points are having same x,y co-ords or false otherwise.
eg : public boolean isEqual(Point2D anotherPoint)
{
 .......
}
eg : p1.isEqual(p2)


5.5 Add calculateDistance method to calculate distance between current point and specified point & return the distance to the caller.
Hint : Use distance formula . Use java.lang.Math class methods --sqrt, pow etc.
eg : public double calculateDistance(Point2D anotherPoint)
{
  Math.sqrt(.....);
}


5.6 Write TestPoint class with a main method Accept co ordinates of 2 points from user (Scanner) --to create 2 points (p1 & p2)

5.7 Use getDetails method to display point details.(p1's details & p2's details)

5.8 Invoke isEqual & display if points are same or different (i.e p1 & p2 are located at the same position)

5.9 Display distance between p1 & p2

 */

package ass4;
import java.lang.Math;


public class Point2D {
	private int cor_x;
	private int cor_y;
	
	
	Point2D(int cor_x, int cor_y) {
		super();
		this.cor_x = cor_x;
		this.cor_y = cor_y;
	}
	
	
	public void display(int x1,int x2) {
		System.out.println("  cor_x: "+cor_x+"\n"+"  cor_y: "+cor_y);
		
	}
	
	public String toString() {
		return "  cor_x: "+cor_x+"\n"+"  cor_y: "+cor_y;
	}
	
	public boolean equals(Point2D anotherpoint) {
		if((this.cor_x==anotherpoint.cor_x)&&(this.cor_y==anotherpoint.cor_y))
			return true; 
		else
			return false;
	 	
	}
	
	public  void calculateDistance(Point2D anotherpoint) {
		int n_x=this.cor_x+anotherpoint.cor_x;
		int n_y=this.cor_y+anotherpoint.cor_y;
		double total= Math.pow(n_x, n_y);
		double dist=Math.sqrt(total);
		System.out.println(" distance: "+dist);
	} 
}
