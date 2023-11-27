/*
 * Solve assignment (to understand abstraction)
1. Create abstract class Shape --state :  x,y 
Abstract Method --public double area();
public String toString() : to ret x & y

Why will area() be abstract in Shape class ?????????

2. Circle -- x,y,radius
Concrete overriding Method --public double area() : ret area of circle
public String toString() : ret x, y & radius

3. Rectangle -- x,y,w,h
Concrete overriding Method --public double area() : ret area of rectangle
public String toString() : ret x, y , width & height

4. Square-- x,y,side
Concrete overriding Method --public double area() : ret area of square
public String toString() : ret x, y , side

5. Create a Tester class :test all shape classes
 
 */

package code;

public abstract class Shape {
	protected int x;
	protected int y;
	
	public Shape(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	
	
	@Override
	public String toString() {
		return "Shape [x=" + x + ", y=" + y + "]";
	}



	public abstract double area();



	

}
