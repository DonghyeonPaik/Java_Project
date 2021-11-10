package inheritance07.quiz01;

class Fruits {
	protected String name;
	protected String color;
	protected int size;
	public Fruits(String name, String color, int size) {
		setName(name);
		setColor(color);
		setSize(size);
	}
	public void initFruits() {
		name = "과일";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public String showFruitsInfo() {
		return name+"의 색상은 "+color+"이고, 크기는 "+size+"입니다.";
	}
}
class Apple extends Fruits{
	public Apple(String name, String color, int size) {
		super(name, color, size);
		this.name = name;
		this.color = color;
		this.size = size;
	}
}
class Orange extends Fruits{
	public Orange(String name, String color, int size) {
		super(name, color, size);
		this.name = name;
		this.color = color;
		this.size = size;
	}
}
class Banana extends Fruits{
	public Banana(String name, String color, int size) {
		super(name, color, size);
		this.name = name;
		this.color = color;
		this.size = size;
	}
}