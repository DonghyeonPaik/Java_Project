package inheritance07;

public class ColorPoint extends Point {
	// 자식 클래스인 ColorPoint가 부모 클래스 Point를 상속받는 것!
	
	private String color;
	
	public void setColor(String color) {
		this.color = color;
	}
	public void showColorPoint() {
		System.out.println(color);
		showPoint();
	}
}
