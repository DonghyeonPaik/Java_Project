package exception10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileNotFoundException01 {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file1 = null; // 파일에서 값을 읽어오는 스트림
		try {
			file1 = new FileInputStream("a.txt");
			int read = 0;
			// .txt 파일 한 글자씩 읽어오기
			while((read=file1.read())!=-1) System.out.print((char)read);
			file1.close();
			System.out.println();
			
		}catch(FileNotFoundException e) {
			// 파일의 경로를 찾을 수 없는 경우의 예외처리
			System.out.println("Exception: "+e);
		}
		System.out.println("프로그램 정상 종료");
	}
}