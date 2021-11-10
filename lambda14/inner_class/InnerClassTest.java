package lambda14.inner_class;

class OutClass {
	private int num = 10;
	// private 변수이면서 인스턴스(멤버) 변수, 객체화해서 사용

	private static int sNum = 20;
	// private 변수이면서 static(정적) 변수, 객체화 없이 사용

	private InClass inClass;
	// 외부의 클래스를 객체화할 때, 내부 클래스도 객체화하기 위한 호출.

	public OutClass() {
		inClass = new InClass();
	}

	static void outTest1() {
		System.out.println("외부 클래스의 인스턴스 메소드 호출 성공");
	}

	static void outTest2() {
		System.out.println("외부 클래스의 정적 메소드 호출 성공");
	}
	
	public void usingClass() { // 내부 클래스의 메소드 호출
		inClass.inTest();
	}
	
	class InClass { // 내부 클래스: 외부 클래스와의 빈번한 작업 처리를 담당시키기 위함.
		int inNum = 100;
		// 내부 클래스에서는 static을 쓸 수 없음. 인스턴스 변수만 사용 가능.

		void inTest() {
			System.out.println("OutClass num = " + num);
			System.out.println("OutClass sNum = " + sNum);
			System.out.println("InClass inNum = " + inNum);
		}

		public void usingClass() {
			inClass.inTest();
		}
	}
	static class InStaticClass{
		int inNum = 100; // 인스턴스 변수
		static int sInNum = 200; // 정적 변수
		
		void inTest() {
			// 외부 클래스의 인스턴스 변수를 사용할 수 없음.
			sNum+=10;
			sInNum+=10;
			
			System.out.println("InStaticClass inNum = " + inNum);
			System.out.println("InStaticClass sInNum = " + sInNum);
			System.out.println("OutClass sNum = " + sNum);
		}
		
		static void sTest() { // 인스턴스 변수 사용 불가
			sNum+=10;
			sInNum+=10;
			
			System.out.println("OutClass sNum = "+sNum);
			System.out.println("InStaticClass sInNum = "+sInNum);
		}
	}
}

public class InnerClassTest {
	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		System.out.println("외부 클래스를 호출하여 내부 클래스 기능을 호출");
		outClass.usingClass();
		System.out.println();
		
//		OutClass.InClass inClass2 = new OutClass.InClass();
	//  InClass는 OutClass의 내부 클래스이므로 상위 클래스를 인스턴스로 생성한 후 객체화해야 함!
		
		OutClass.InClass inClass = outClass.new InClass(); // 내부 클래스 객체화
		System.out.println("외부 클래스 변수를 통한 내부 클래스 객체 생성");
		inClass.inTest();
		System.out.println();
		
		// 정적 내부 클래스는 외부 인스턴스 생성 없이 객체 생성 가능함
		OutClass.InStaticClass inStaticClass = new OutClass.InStaticClass();
		System.out.println("외부 클래스 생성 없이 정적 내부 클래스 호출");
		inStaticClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스의 정적 메소드 호출");
		OutClass.InStaticClass.sTest(); // 객체 생성 없이 클래스 이름으로 바로 호출
	}
}
