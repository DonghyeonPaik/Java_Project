package interface08.lab03_bookshelf;

public class BookShelfTest02 {
	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		int i=0;
		while(i<100) shelfQueue.enQueue("태백산맥 "+(++i));
		System.out.println("책장에 꽂힌 책의 수: " +shelfQueue.getSize());
		
		for(i=0; i<30; i++) System.out.println(shelfQueue.deQueue());
		System.out.println("책장에 남은 책의 수: " +shelfQueue.getSize());
	}
}
