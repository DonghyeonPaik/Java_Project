package exception10.p431_442;

public class ThrowsExample {
	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("프로그램 종료");
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}
	}
	public static void findClass() throws ClassNotFoundException{
		// static이어야 호출 가능하므로 static을 명시
		
		Class<?> clazz = Class.forName("java.lang.String2");
		clazz.getClass();
	}
}
