package ass4;
import java.util.Scanner;
public class PointTester {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	Point2D p1=new Point2D(5,5);
	Point2D p2=new Point2D(5,5);
	p1.display(0, 0);
	p2.display(0, 0);
	System.out.println(p1);
	System.out.println(p2);
	p1.calculateDistance(p2);
	System.out.println(p1.equals(p2));
	
	

	}

}
