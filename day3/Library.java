package week1.day3;

public class Library {
	
	public static String addBook(String bookTitle) {
		System.out.println("Book added successful");
		return bookTitle;
	}
		
	public void issueBook() {
		System.out.println("Book issued successfully");
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Library lib = new Library();
		System.out.println(lib.addBook("Famous Five"));
		lib.issueBook();
		
		

	}

}
