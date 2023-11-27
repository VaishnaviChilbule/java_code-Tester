/*Create Book class  (in code package) with data member bookId,name,author,price
.Add both default and parameter constructor.Write getters and setters for all data members.Write Display Method for displaying all data members.
Create TestBook class(in tester package)
1:Create 2 objects of Book class by invoking default and parameter constr and display details of book.
*/


package ass3;

public class Book {
	private String bname;
	private int id;
	private String bauthor;
	private int price;
	Book() {
		super();
		this.id=1;
		this.bname ="java";
		this.bauthor ="headfirst";
		this.price =150;
	}
	Book(int id,String bname, String bauthor, int price) {
		super();
		this.id=id;
		this.bname = bname;
		this.bauthor = bauthor;
		this.price = price;
		
	}
	
	 public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBname() {
		return bname;
	}

	public void setBname(String bname) {
		this.bname = bname;
	}

	public String getBauthor() {
		return bauthor;
	}

	public void setBauthor(String bauthor) {
		this.bauthor = bauthor;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void displayInfo() {
		System.out.println(" id: "+id+"\n"+" book_name: "+bname+"\n"+" author_name: "+bauthor+"\n"+" price: "+price);
	}
	
	public void displayInfo(String bnm,String auth,int pc) {
		System.out.println(" id: "+id+"\n"+" book_name: "+bname+"\n"+" author_name: "+bauthor+"\n"+" price: "+price);
	}
	
	

}
