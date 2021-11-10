package lambda14.inner_class;

class Outer3{ // 외부 (인스턴스) 클래스
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { // java.lang.Runnable
		int num = 100;
		
		return new Runnable() {
			int localNum = 10;
			
			@Override
			public void run() {
//				num = 200; // 상수로밖에 못 씀
//				i=100; // 상수로밖에 못 씀
				
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				System.out.println("outNum = "+outNum+" [외부 클래스의 인스턴스 변수]");
				System.out.println("Outer.sNum = "+Outer3.sNum+" [외부 클래스의 정적 변수]");
			}
		};
	}
}

public class LocalInnerClass2 {
	// 지역 내부 클래스(Local Inner Class): 메소드 내에 클래스를 정의하는 것.
	// 익명 내부 클래스: 지역 내부 클래스의 이름을 생략한 것.
	// 람다식은 JAVA에서 내부적으로 익명 내부 클래스로 작동함.	
	
	public static void main(String[] args) {
		Outer3 outer3 = new Outer3();
		Runnable runnable = outer3.getRunnable(10);
		runnable.run();
	}

}
