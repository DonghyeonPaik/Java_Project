package object06;

public class EncapsulationExample01 {
	public static void main(String[] args){
		Encapsulation e1 = new Encapsulation();
		e1.name = "Lion";
		e1.age = 30;
		System.out.println(e1.name);
		System.out.println(e1.age);
		e1.eat("Fresh meat");
		e1.speak(5);
		e1.love("John");
		Mother m1 = new Mother();
		m1.siblings = "aunt Marry";
		m1.name = "Julie";
		m1.love("John");
	}
}
