package basicClass11.object;

public class Integer_Ex {

	public static void main(String[] args) {
		// Integer도 toString() 숫자를 return하는 것으로 재정의되어 있음.
		
		// 객체화하여 선언
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(200);
		
		// 객체화하지 않고 선언
		Integer i3 = 300;
		
		System.out.println(i1);
		System.out.println(i2);
		System.out.println(i3);
	}
}