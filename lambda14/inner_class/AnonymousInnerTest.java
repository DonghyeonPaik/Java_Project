package lambda14.inner_class;

class Outer2{
	Runnable getRunnable(int i) {
		int num = 100;
		
		return new Runnable() {
			@Override
			public void run() {
				System.out.println("i = "+i);
				System.out.println("num = "+num);
			}
		};
	}
	Runnable runner = new Runnable() {
		@Override
		public void run() {
			System.out.println("Runnable이 구현된 익명 클래스 변수");
		}
	}; // 익명 내부 클래스로 메소드 이름 없이 작성함.
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outer2 outer2 = new Outer2();
		outer2.runner.run();
		outer2.getRunnable(10).run();
	}
}
