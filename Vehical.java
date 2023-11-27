/*2.1:Create Showroom application for Vehicle management
2.2:create a class with data members(id,name,color,price)
2.3 create constructor to initialize data member
2.4 add disscount as static data member in Vehicle class 
2.5 use static block to assign.
2.6 create getter setter and override  toString()(hint:show disccount)
2.7 create tester class....create array to store 10 vechile...create menu driven program 1:show all 2:add vehicle...3:edit color 4:edit price 5:remove 

*/
package ass4;

public class Vehical {
	private int id;
	private String name;
	private String color;
	private double price;
	private static double discount;
	static {
		discount=0.35;
	}
	public Vehical(int id, String name, String color, double price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Vehical [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + ", discount=" + discount +"]";
	}
	public void displayInfo(int id, String name, String color, double price) {
		System.out.println("Vehical [id=" + id + ", name=" + name + ", color=" + color + ", price=" + price + "]");
	}
	

}
