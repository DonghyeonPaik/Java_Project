package interface08.lab03_bookshelf;

public class BookShelfTest {
	public static void main(String[] args) {
		
		Queue shelfQueue = new BookShelf();
		shelfQueue.enQueue("태백산맥 1");
		shelfQueue.enQueue("태백산맥 2");
		shelfQueue.enQueue("태백산맥 3");
		shelfQueue.enQueue("태백산맥 4");
		shelfQueue.enQueue("태백산맥 5");
		System.out.println(shelfQueue.getSize());
		
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.deQueue());
		System.out.println(shelfQueue.getSize());
	}
}
