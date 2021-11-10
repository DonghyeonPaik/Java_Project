package lambda14.lambda.lab01;

public class StringConcatTest {

	public static void main(String[] args) {
		String st1 = "Hello";
		String st2 = "Java";
		
		// 1. 객체지향으로 출력: 객체의 메소드로 호출
		System.out.print("객체의 메소드로 호출하여 출력: ");
		StringConcatImplements sci = new StringConcatImplements();
		sci.makeString(st1, st2);
		
		// 2. 람다식을 사용해서 출력
		System.out.print("람다식을 사용해서 출력: ");
		StringConcat sc = (s1,s2)->System.out.println(s1+", "+s2);
		sc.makeString(st1, st2);
		
		// 3. 익명 내부 클래스를 사용해서 출력
		System.out.print("익명 내부 클래스를 사용해서 출력: ");
		StringConcat sca = new StringConcat() {
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+", "+s2);
			}
		};
		sca.makeString(st1, st2);
	}
}