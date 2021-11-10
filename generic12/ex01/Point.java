package generic12.ex01;

public class Point<T, V> {
	// Generic Class로, 두 점의 좌표를 받아서 좌표와 넓이를 구하는 역할을 함
	
	T x;
	V y;
	
	Point (T x, V y){ // 생성자
		this.x = x;
		this.y = y;
	}
	
	public T getX() {
		return x;
	}
	public V getY() {
		return y;
	}
}
