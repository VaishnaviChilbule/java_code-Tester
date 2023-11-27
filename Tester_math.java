package assignment_2;

public class Tester_math {

	public static void main(String[] args)
	{
		Math_operation math_obj=new Math_operation();
		math_obj.add(10, 20);
        int a=10,b=59;
		
		math_obj.add(a, b);
		double d1=90.33,d2=93.22;
		math_obj.add(d1, d2);
		
		math_obj.add(a, d1);
		math_obj.add(d1, a);
		
		math_obj.add(1,1,1,1,1,1,1,1);
		
	}
	

}
