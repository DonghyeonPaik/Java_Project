package interface08.lab03_bookshelf;

import java.util.ArrayList;

public class Shelf {
	
	protected ArrayList<String> shelf;
	
	public Shelf(){ // 생성자
		shelf = new ArrayList<String>(); // ArrayList 생성
	}
	public ArrayList<String> getShelf(){
		return shelf;
	}
	public int getCount() {
		return shelf.size();
	}
	
}
