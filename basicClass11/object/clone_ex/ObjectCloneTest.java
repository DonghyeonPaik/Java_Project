package basicClass11.object.clone_ex;

class Point{
	int x;
	int y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString() {
		return "x="+x+", y="+y;
	}
}
class Circle implements Cloneable{
	// clone은 Cloneable을 선언해야 가능함. 그리고 Override해서 써야 함.
	Point point;
	int radius;
	
	public Circle(int x, int y, int radius) {
		point = new Point(x,y);
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return "원점은 "+point+"이고, 반지름은 "+radius+"입니다.";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException{
		// clone() 메소드 오버라이딩
		return super.clone();
	}
}

public class ObjectCloneTest {
	public static void main(String[] args) throws CloneNotSupportedException{
		Circle circle = new Circle(10, 20, 30);
		Circle copyCircle = (Circle) circle.clone();
		
		System.out.println(circle);
		System.out.println(copyCircle);
		
		System.out.println(System.identityHashCode(circle));
		System.out.println(System.identityHashCode(copyCircle));
	}
}
