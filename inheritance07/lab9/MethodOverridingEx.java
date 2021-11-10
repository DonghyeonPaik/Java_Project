package inheritance07.lab9;

public class MethodOverridingEx {
	
	static void paint(Shape p) {
		p.draw(); // 업캐스팅
	}
	static void paint_l(Line l) {
		l.draw();
	}
	static void paint_r(Rect r) {
		r.draw();
	}
	static void paint_c(Circle c) {
		c.draw();
	}
	
	public static void main(String[] args) {
		System.out.println("-----업캐스팅-----");
		// 하나의 메소드로 부모, 자식클래스를 모두 처리
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
		System.out.println("-----다운캐스팅-----");
		// 클래스마다 호출하기 위한 메소드를 따로 만들어서 지정함
		paint_l(new Line());
		paint_r(new Rect());
		paint_c(new Circle());
	}
}
// 메소드 오버라이딩은 상속관계에서 사용하고,
// 메소드 오버로딩은 이름은 같게하고 매개변수를 달리해서 쓰는 것.