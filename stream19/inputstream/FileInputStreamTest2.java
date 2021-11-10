package stream19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			// Finally에 close를 자동으로 처리 [Auto-close]
			int i;
			while((i=fis.read())!=-1) { // 파일의 마지막 끝까지 읽어옴
				System.out.println((char)i);
			}
			
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("파일 읽기 종료");
	}
}
