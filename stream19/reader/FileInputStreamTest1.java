package stream19.reader;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest1 {
	// 바이트 스트림이라 한글의 경우 글자가 깨짐. 영문은 ASCII code로 저장됨
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		fis = new FileInputStream("reader.txt");
		
		int i;
		while((i=fis.read())!=-1) {
			System.out.println((char)i);
		}
		fis.close();
		System.out.println("프로그램 종료");
	}
}
