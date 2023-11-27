package code;

public class Rectangle extends Shape {
	private double width;
	private double height;
	
	public Rectangle(int x, int y, double width, double height) {
		super(x, y);
		this.width = width;
		this.height = height;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + " ,x "+ x +" , y " + y +"]";
	}
	@Override
	public double area() {
		double area=width*height;
		return area;
	}
	
	

}
