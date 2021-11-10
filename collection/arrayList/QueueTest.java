package collection.arrayList;

import java.util.ArrayList;

class MyQueue {
	private ArrayList<String> arrayQueue = new ArrayList<>();

	public void enQueue(String data) {
		arrayQueue.add(data);
	}

	public String deQueue() {
		if (arrayQueue.size() == 0) {
			System.out.println("Queue가 비어있습니다.");
			return null;
		} else {
			return arrayQueue.remove(0);
		}
	}

	public void showAll() {
		for (String s : arrayQueue) {
			System.out.println(s);
		}
	}
}

public class QueueTest {

	public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
		queue.enQueue("D");
		queue.showAll();
		System.out.println();
		queue.deQueue();
		queue.showAll();
		System.out.println();
		queue.deQueue();
		queue.showAll();
	}
}
