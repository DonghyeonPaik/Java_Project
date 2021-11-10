package exception10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionHandling03 {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("c.txt");
			System.out.println("try block 실행 완료");
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("catch Exception");
			return;
		} finally {
			// try 블럭이 실행되면 반드시 실행되는 블럭임! 예외 발생과 관계없이 실행
			System.out.println("finally block 실행");
			//if(fis!=null) {
				try {
					fis.close();
					System.out.println("객체 메모리에서 정상 제거");
				}catch(IOException | NullPointerException e) {
					System.out.println(e);
					System.out.println("객체 메모리에서 제거 안됨");
				}
			//}
		}
		System.out.println("프로그램 종료");
		return;
	}
}