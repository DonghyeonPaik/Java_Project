package stream19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {

	public static void main(String[] args) {
		
//		FileInputStream fis = new FileInputStream("input.txt");
//		FileInputStream fis = new FileInputStream("C:\\BDH\\input.txt");
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt"); // 반드시 예외처리해야 함
			System.out.println((char)fis.read()); // 파일에서 한 글자 읽어옴
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (IOException e) {
			System.out.println(e);
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				System.out.println(e);
			}
		}
		
		
		System.out.println("end (프로그램 종료)");
	}
}
