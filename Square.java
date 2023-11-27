package code;

public class Square extends Shape {
	private int side;

	public Square(int x, int y, int side) {
		super(x, y);
		this.side = side;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + " ,x "+ x +" , y " + y +"]";
	}

	@Override
	public double area() {
		double area=side*side;
		return 0;
	}
	
	

}
