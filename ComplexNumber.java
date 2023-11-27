//5. Create a class ComplexNumber with data members real, imaginary. add the display function. 
//Create the object of this class in main method and invoke all the methods in that class.


package ass2;

public class ComplexNumber {
	private int real;
	private int imaginary;
	ComplexNumber() {
		super();
		this.real = 0;
		this.imaginary = 0;
	}
	
	ComplexNumber(int real, int imaginary) {
		super();
		this.real = real;
		this.imaginary = imaginary;
	}

	public int getReal() {
		return real;
	}

	public void setReal(int real) {
		this.real = real;
	}

	public int getImaginary() {
		return imaginary;
	}

	public void setImaginary(int imaginary) {
		this.imaginary = imaginary;
	}
	public void display() {
		System.out.println(" Complex_number: "+real+"+"+"i"+imaginary);
	}
	public void display(int rl,int img) {
		System.out.println(" Complex_number: "+real+"+"+"i"+imaginary);
	}

}
