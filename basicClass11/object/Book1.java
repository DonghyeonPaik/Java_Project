package basicClass11.object;

public class Book1 {
	int bookNumber;
	String bookTitle;
	
	Book1(){} // 기본 생성자: bookNumber: 0, bookTitle: Null
	Book1(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}
	
	@Override
	public String toString() {
		// toString()은 이런 식으로 Override해서 많이 사용함
		return bookNumber+"."+bookTitle;
	}
	
	public static void main(String[] args) {
		
		Book1 book1 = new Book1(200, "개미");
		
		System.out.println(book1);
		System.out.println(book1.toString());
	}

}
