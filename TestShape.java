package Tester;
import code.*;
public class TestShape {

	public static void main(String[] args) {
		Circle cobj=new Circle(2,3,4);
		System.out.println(cobj);
		System.out.println(cobj.area());
		
		
		Rectangle robj=new Rectangle(5,6,2,3);
		System.out.println(robj);
		System.out.println(robj.area());
		
		
		Square sobj=new Square(3,8,4);
		System.out.println(sobj);
		System.out.println(sobj.area());

	}

}
