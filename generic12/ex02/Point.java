package generic12.ex02;

public class Point {
	private int x, y;
	
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "좌표: ("+x+","+y+")";
	}
}
