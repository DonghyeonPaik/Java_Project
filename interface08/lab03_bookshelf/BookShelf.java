package interface08.lab03_bookshelf;

public class BookShelf extends Shelf implements Queue {

	@Override
	public void enQueue(String title) {
		shelf.add(title);
	}

	@Override
	public String deQueue() {
		return shelf.remove(0); // 0번째 Array를 출력하면서 제거
	}

	@Override
	public int getSize() {
		return getCount(); // getCount() == return shelf.size()
	}
	
}