package code;

public class Circle extends Shape {
	private int radius;

	public Circle(int x, int y, int radius) {
		super(x, y);
		this.radius = radius;
	}

	

	@Override
	public String toString() {
		return "Circle [radius=" + radius + " ,x "+ x +" , y " + y + "]";
	}



	@Override
	public double area() {
		double area=(3.14)*radius*radius;
		return area;
	}
	
	

}
