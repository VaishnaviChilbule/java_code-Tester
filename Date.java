package ass2;

public class Date {
	private int day;
	private int year;
	private int month;
	Date() {
		super();
		this.day = 3;
		this.month = 12;
		this.year = 2021;
	}
	Date(int day, int month, int year) {
		super();
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public void displayDate() {
		System.out.println(" date: "+day+"/"+month+"/"+year);
	}
	public void displayDate(int dt,int mth,int yr ) {
		System.out.println(" date: "+day+"/"+month+"/"+year);
	}

}
