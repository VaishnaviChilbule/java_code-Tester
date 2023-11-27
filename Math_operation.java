//1:Create MathOperation class,create overloaded  add method for accepting 
//different data type and show addition (use:Function Overloading)
//Write method accepting variable arguments of type int and show sum of all elements(use:varargs)
//Create tester class and call methods from MathOperation class.



package assignment_2;

public class Math_operation
{
	public void add(int num1,int num2) 
	{
		int total=num1+num2;
        System.out.println("total="+total);
	}

	public void add(double num1,double num2) 
	{
		double total=num1+num2;
        System.out.println("total="+total);
	}
	
	public void add(int num1,double num2) 
	{
		double total=num1+num2;
        System.out.println("total"+total);
	}
	public void add(double num1,int num2) 
	{
		double total=num1+num2;
        System.out.println("total"+total);
	} 
	
	public void add(int... numbers) {
		int total=0;
		for(int i=0;i<numbers.length;i++) {
			total=total+numbers[i];
		}
		System.out.println("addition of all integer number is:"+total);
	}
}
