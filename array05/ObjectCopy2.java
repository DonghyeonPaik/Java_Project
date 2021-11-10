package array05;

public class ObjectCopy2 {
	public static void main(String[] args) { // 객체 배열 복사: 주소만 복사됨.
		Book[] bookArray1 = new Book[3];
		Book[] bookArray2 = new Book[3];
		
		bookArray1[0] = new Book("태백산맥", "조정래");
		bookArray1[1] = new Book("데미안", "헤르만 헤세");
		bookArray1[2] = new Book("어떻게 살 것인가", "유시민");
		System.arraycopy(bookArray1, 0, bookArray2, 0, 3);
		
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		bookArray1[0].setBookName("나목");
		bookArray1[0].setAuthor("박완서");
		System.out.println("====================");
		for(int i=0; i<bookArray1.length; i++) {
			bookArray1[i].showBookInfo();
		}
		System.out.println("====================");
		for(int i=0; i<bookArray2.length; i++) {
			bookArray2[i].showBookInfo();
		}
		// 주소만 바꾸다 보니 주소에 다른 게 들어오면 그대로 반영되는 문제 발생!
	}
}
