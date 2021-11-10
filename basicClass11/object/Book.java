package basicClass11.object;

public class Book {
	int bookNumber;
	String bookTitle;
	
	Book(){} // 기본 생성자: bookNumber: 0, bookTitle: Null
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	public static void main(String[] args) {
		
		Book book1 = new Book(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
		// toString()은 주소를 return해준다
	}
}
