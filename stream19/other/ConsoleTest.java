package stream19.other;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		Console console = System.console(); // Console 인스턴스 변수 생성
		
		System.out.print("이름을 입력하세요 >> ");
		String name = console.readLine();
		System.out.print("직업을 입력하세요 >> ");
		String job = console.readLine();
		System.out.print("비밀번호를 입력하세요 >> ");
		char[] password = console.readPassword();
		String strPass = new String(password); // password 배열 값을 String으로 변환
		
		System.out.println("이름: "+name);
		System.out.println("직업: "+job);
		System.out.println("비밀번호: "+strPass);
	}
}
