package interface08.lab03_bookshelf;

public interface Queue {
	
	void enQueue (String title); // 책장에 책을 저장하는 역할.
	String deQueue (); // 책장에서 책을 빼내는 역할.
	int getSize(); // 책장에 꽂혀있는 책의 수.
	
}
