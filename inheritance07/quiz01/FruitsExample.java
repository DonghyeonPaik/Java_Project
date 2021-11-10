package inheritance07.quiz01;

import java.util.ArrayList;

public class FruitsExample {
	public static void main(String[] args) {
		ArrayList<Fruits> fruitsList = new ArrayList<Fruits>();
		Fruits apple = new Fruits("사과", "빨간색", 10);
		Fruits orange = new Fruits("오렌지", "주황색", 7);
		Fruits banana = new Fruits("바나나", "노랑색", 15);
		
		fruitsList.add(apple);
		fruitsList.add(orange);
		fruitsList.add(banana);
		
		System.out.println("========== 과일 정보 출력 ==========");
		for(Fruits f: fruitsList) {
			System.out.println(f.showFruitsInfo());
		}
	}
}
