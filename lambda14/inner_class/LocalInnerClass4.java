package lambda14.inner_class;

class Outer5{ // 외부 (인스턴스) 클래스
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) { // java.lang.Runnable
		int num = 100;
		
		return new Runnable(){ 
			int localNum = 10;
			
			@Override
			public void run() {
				System.out.println("i = "+i);
				System.out.println("num = "+num);
				System.out.println("localNum = "+localNum);
				System.out.println("outNum = "+outNum+" [외부 클래스의 인스턴스 변수]");
				System.out.println("Outer.sNum = "+Outer.sNum+" [외부 클래스의 정적 변수]");
			}
		};
	}
}

public class LocalInnerClass4 {
	// 지역 내부 클래스(Local Inner Class): 메소드 내에 클래스를 정의하는 것.
	// 익명 내부 클래스: 지역 내부 클래스의 이름을 생략한 것.
	// 람다식은 JAVA에서 내부적으로 익명 내부 클래스로 작동함.	
	
	public static void main(String[] args) {
		Outer5 outer = new Outer5();
		outer.getRunnable(10).run();
	}

}
