package lambda14.lambda.lab03;

@FunctionalInterface
interface PrintString{
	void showString(String str);
}

public class LambdaTest {
	
	public static void showMyString(PrintString p) {
		p.showString("Hello Lambda2");
	}
	public static PrintString returnString() {
		return s->System.out.println(s+" World");
	}
	
	public static void main(String[] args) {
		
		System.out.println("1. 람다식을 변수에 대입");
		PrintString lambdaStr = s -> System.out.println(s);
		lambdaStr.showString("Hello Lambda1");
		
		System.out.println("2. 메소드의 매개변수로 전달");
		showMyString(s -> System.out.println(s));
		// showMyString(lambdaStr); 와 같음
		
		System.out.println("3. return 값으로 람다식을 사용");
		PrintString reStr = returnString();
		reStr.showString("Hello");
	}
}
