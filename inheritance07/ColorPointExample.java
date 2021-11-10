package inheritance07;

public class ColorPointExample {
	
	public static void main(String[] args) {
		Point p = new Point();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.set(3, 4); // ColorPoint 클래스 자체에는 set 메소드가 없음. 상속된걸 쓴 것.
		cp.setColor("red");
		cp.showColorPoint();
	}
}
