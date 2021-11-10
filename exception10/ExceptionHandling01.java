package exception10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling01 {
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\test\\c.txt");
			System.out.println("try block 실행 완료");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("catch Exception");
		} finally {
			// try 블럭이 실행되면 반드시 실행되는 블럭임! 예외 발생과 관계없이 실행
			fis.close();
			System.out.println("finally block 실행");
		}
		System.out.println("프로그램 종료");
	}
}
