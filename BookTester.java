/*2:create Library management application with following menu
 Menu 1:Show All Books
 Menu 2:Add New Book
 Menu 3:Update Book
 Menu 4:Delete Book
 Menu 5:edit name 
 Menu 6:edit Author
 Menu 7:edit price
 Menu 8:get book details by bookid
 Menu 9:Show All Books price >450
 Menu 1:Show All Books names only
*/



package ass3;
import java.util.Scanner;

public class BookTester {

	public static void main(String[] args) 
	{
	Scanner sc=new Scanner(System.in);
	int choice=0;
	int index=0;
	Book barr[]=new Book[10];
	do {
		System.out.println("enter your choice:\n"+
				"1:Show All Books\n"+
				"2:Add New Book\n"+
				"3:Update Book\n"+
				"4:Delete Book\n"+
				"5:edit name\n"+ 
				"6:edit Author\n"+
				"7:edit price\n"+
				"8:get book details by bookid\n"+
				"9:Show All Books price >450\n"+
				"10:Show All Books names only");
		choice=sc.nextInt();
		switch(choice) {
		case 1:
			for(int i=0;i<barr.length;i++) {
				if (barr[i]!=null)
				    barr[i].displayInfo();
				}
			break;
		case 2:
			if(index<barr.length) {
			System.out.println("enter id,book_name,author_name and price:");
			int id=sc.nextInt();
			String name=sc.next();
			String aname=sc.next();
			int price=sc.nextInt();
			Book bobj=new Book(id,name,aname,price);
			barr[index]=bobj;
			index++;
			System.out.println("book details is added");
			}
			else {
				System.out.println("Array is Full");
			}
			break;
		case 3:
			System.out.println("enter book id");
			int new_id=sc.nextInt();
			for(int j=0;j<index;j++) {
				if(barr[j].getId()==new_id) {
					System.out.println("book is present there  ");
					barr[j].setId(new_id);
					System.out.println("book id updated");
				}
				else {
					System.out.println("book is not present here");
				}
			}
			break;
		case 4:
			System.out.println("enter the book id:");
			int nid1=sc.nextInt();
			for(int i=0;i<index;i++) {
				if(barr[i].getId()==nid1)
					barr[i]=null;
				    System.out.println("book details deleted");
			}
			break;
		case 5:
			System.out.println("enter book id");
		int nid2=sc.nextInt();
		for(int j=0;j<index;j++) {
			if(barr[j].getId()==nid2) {
				System.out.println("book is present there  ");
				System.out.println("enter new name for book: ");
				barr[j].setBname(sc.next());
				System.out.println("book name updated");
			}
			else {
				System.out.println("book is not present here");
			}
		}
			
			break;
		case 6:
			System.out.println("enter book id");
			int nid3=sc.nextInt();
			for(int j=0;j<index;j++) {
				if(barr[j].getId()==nid3) {
					System.out.println("book is present there  ");
					System.out.println("enter new name for author: ");
					barr[j].setBauthor(sc.next());
					System.out.println("book author name updated");
				}
				else {
					System.out.println("book is not present here");
				}
			}
			break;
		case 7:
			System.out.println("enter book id");
			int nid4=sc.nextInt();
			for(int j=0;j<index;j++) {
				if(barr[j].getId()==nid4) {
					System.out.println("book is present there  ");
					System.out.println("enter price for book: ");
					barr[j].setPrice(sc.nextInt());
					System.out.println("book price updated");
				}
				else {
					System.out.println("book is not present here");
				}
			}
			break;
		case 8:
			System.out.println("enter book id");
			int nid5=sc.nextInt();
			for(int j=0;j<index;j++) {
				if(barr[j].getId()==nid5) {
					System.out.println("book is present there  ");
					barr[j].displayInfo();
				}
				else {
					System.out.println("book is not present here");
				}
			}
			break;
		case 9:
			for(int i=0;i<barr.length;i++) {
				if (barr[i]!=null) {
				if (barr[i].getPrice()>450)
					barr[i].displayInfo();
			}
				
				}
			break;
		case 10:
			for(int i=0;i<barr.length;i++) {
				if (barr[i]!=null)
					System.out.println(barr[i].getBname());
					
			}
			break;
		default :
			break;

		}
		
	}while(choice<=10);
	
	}

}
