package inheritance07.lab13;

import java.util.ArrayList;

class Fruit{ // 부모 클래스
	String fruitName; // 변수의 초기값 할당: 1. 생성자, 2. setter, 3. 객체에서 변수값을 할당
	String color;
	int large;
	
	Fruit(){}
	public Fruit(String fruitName, String color, int large) {
		this.fruitName = fruitName;
		this.color = color;
		this.large = large;
	}
	public String showInfo(){
		return "과일의 내용을 출력합니다. ";
	}
}
class Apple extends Fruit{
	public Apple(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	@Override
	public String showInfo() {
		return "과일 이름은 "+fruitName
				+"이고, 과일 색상은 "+color+"이고, 크기는 "+large+"입니다.";
	}
}
class Orange extends Fruit{
	public Orange(String fruitName, String color, int large) {
		super(fruitName, color, large);		
	}
	@Override
	public String showInfo() {
		return "과일 이름은 "+fruitName
				+"이고, 과일 색상은 "+color+"이고, 크기는 "+large+"입니다.";
	}
}
class Banana extends Fruit{
	public Banana(String fruitName, String color, int large) {
		super(fruitName, color, large);
	}
	@Override
	public String showInfo() {
		return "과일 이름은 "+fruitName
				+"이고, 과일 색상은 "+color+"이고, 크기는 "+large+"입니다.";
	}
}

public class Fruit_test {
	public static void main(String[] args) {
		ArrayList<Fruit> fruitList = new ArrayList<Fruit>();
		Fruit apple = new Apple("사과", "빨강", 10);
		Fruit orange = new Orange("오렌지", "주황", 7);
		Fruit banana = new Banana("바나나", "노랑", 20);
		fruitList.add(apple);
		fruitList.add(orange);
		fruitList.add(banana);
		
		for(Fruit f: fruitList) {
			System.out.println(f.showInfo());
		}
	}
}
