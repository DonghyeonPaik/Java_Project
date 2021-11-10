package array05;

public class BookArray {
	public static void main(String[] args) {
		Book[] library = new Book[5]; // Book이란 객체를 저장할 배열 공간 생성
		
		library[0] = new Book("태백산맥", "조정래");
		library[1] = new Book("데미안", "헤르만 헤세");
		library[2] = new Book("어떻게 살 것인가?", "유시민");
		library[3] = new Book("토지", "박경리");
		library[4] = new Book("어린 왕자", "생텍쥐베리");
		
		for(int i=0; i<library.length; i++) {
			library[i].showBookInfo(); // 객체의 메소드를 호출해서 객체정보 출력
		}
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]); // 객체의 주소값만 있음.
		}
	}
}
