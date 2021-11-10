package datatype01;

public class EscapeChar {

	public static void main(String[] args) {
		
		// Escape 문자: 문자열 내에서 특수한 기능을 수행하는 문자
		
		System.out.println("Hit Homerun");
		// 아래의 \s, \t 같은 것들이 Escape 문자임.
		System.out.println("Hit\sHomerun\tRun");
		System.out.println("Hit\nHomerun");
		System.out.println("Hit Homerun");
		// \r는 커서를 해당 줄에서 맨 처음으로 옮겨준다. (carriage return)
		System.out.println("My NickName is superman\rxx");
		// Console에서는 줄바꿈이 되는데 Terminal에서는 줄의 맨 첫번째로 cursor가 이동함.
		// 그래서 My가 저장된 자리에 xx가 들어오게 됨.
		
		// 키보드의 엔터는 ASCII code로 13, 10임. 즉, \r\n과 같음.
		System.out.println("\r\nHello!");
		
		// escape 문자를 통해서 double quotation이 문자열에 들어갈 수 있다.
		System.out.println("\"안되나요\"");
		
		// \\는 특수문자가 아니라는 것을 컴파일러에게 알려주는 역할을 함.
		// 원래는 D:\BDH\workspace, D:\nDrive\table 인데 이거를 그대로 출력할 순 없음.
		// 특히 두번째 주소는 \n, \t가 특수문자로 인식되기 때문.
		System.out.println("이 파일은 D:\\BDH\\workspace 안에 있습니다.");
		System.out.println("이 파일은 D:\\nDrive\\table 안에 있습니다.");
		
		// Format String: 출력 형식을 지정하기 위한 형식 문자열
		// %s, %d와 같은 변환 지시어(Conversion Specifier)로 원하는 출력 형식을 만들 수 있음.
		int kor = 99, eng = 80, math = 96;
		String hello = new String("Hello!");
		System.out.printf("%d\r\n%s\r\n", kor, hello);
		
		double average = (kor+eng+math)/3.0;
		System.out.printf("\n국영수 평균: %.2f\r\n", average);
		// 참고로 print는 줄바꿈이 안되고, println은 줄바꿈이 가능함. printf는 여러 형식을 지정 가능함.
		System.out.printf("국어: %d\t수학: %d\t영어: %d\t평균: %.2f%n", kor, eng, math, average);
		System.out.printf("국어:%4d\s\s수학:%4d\s\s영어:%4d\s\s평균: %6.2f%n", kor, eng, math, average);
		// 참고로 문자열로도 출력 가능
		System.out.printf("국어: %s\t수학: %s\t영어: %s\t평균: %s%n", kor, eng, math, average);
		// %5d: 다섯자리 우측정렬 출력, %-5d: 다섯자리 좌측정렬 출력
		System.out.printf("%5d\r\n%-5d%n", 116, 116);
		// % 문자를 출력하려면 %%로 나타내야 함.
		System.out.printf("%c, %b, %s, %%%n", 'A', 1, "문자열이지롱");
		System.out.printf("%s, %s, %s, %s%n", 'A', true, "문자열이지롱", '%');
		
		System.out.println("=========================================");
		System.out.printf("|%21s\s\t\t|%n", "자바반 성적표");
		System.out.println("=========================================");
		System.out.printf("|%-9s|%-9s|%-9s|%-9s|%n", "KOREAN", "ENGLISH", "MATH", "AVERAGE");
		System.out.println("-----------------------------------------");
		System.out.printf("|%-9s|%-9s|%-9s|%-2.2f\t|%n", kor, eng, math, average);
		System.out.println("=========================================");
	}
}