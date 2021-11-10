package inheritance07;

public class Point /* extends Object가 생략되어있는 것.*/{
	
	private int x, y;
	
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+", "+y+")");
	}
}
