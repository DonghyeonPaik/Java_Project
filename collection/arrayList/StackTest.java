package collection.arrayList;

import java.util.ArrayList;

class MyStack{
	private ArrayList<String> arrayStack = new ArrayList<String>();
	public void push(String data) {
		arrayStack.add(data);
	}
	public String pop() {
		int len = arrayStack.size();
		if(len==0) {
			System.out.println("스택이 비어있습니다.");
			return null;
		}
		return (arrayStack.remove(len-1));
	}
	public void showAll() {
		for(String s: arrayStack) {
			System.out.println(s);
		}
	}
}

public class StackTest {

	public static void main(String[] args) {
		MyStack stack = new MyStack();
		stack.pop();
		System.out.println();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		stack.push("D");
		stack.showAll();
		System.out.println();
		stack.pop();
		stack.showAll();
		System.out.println();
		stack.pop();
		stack.showAll();
		
	}
}
