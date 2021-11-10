package collection.linkedList;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<String>();
		myList.add("A");
		myList.add("B");
		myList.add("C");
		System.out.println(myList); // LinkedList의 toString이 재정의되어 있음
		System.out.println("index 1번에 D 삽입");
		myList.add(1, "D");
		System.out.println(myList);
		System.out.println("addFirst() 메소드 사용");
		myList.addFirst("E");
		System.out.println(myList);
		System.out.println("addLast() 메소드 사용");
		myList.addLast("F");
		System.out.println(myList);
		System.out.println("remove() 메소드 사용");
		myList.remove(1);
		System.out.println(myList);
		System.out.println("removeFirst() 메소드 사용");
		myList.removeFirst();
		System.out.println(myList);
		System.out.println("removeLast() 메소드 사용");
		myList.removeLast();
		System.out.println(myList);
		
	}
}
