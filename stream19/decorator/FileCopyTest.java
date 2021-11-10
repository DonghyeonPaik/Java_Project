package stream19.decorator;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {

	public static void main(String[] args) throws IOException {
		// FileInputStream: 바이트 스트림 [1바이트씩 읽어서 처리]
		FileInputStream fis = new FileInputStream("C:\\Temp\\e.exe");
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\f.exe");
		
		long milliSecond = System.currentTimeMillis();
		
		int i, j=0;
		while((i=fis.read())!= -1) {
			fos.write(i); // 원본 fis를 1바이트씩 읽어서 fos에 복사
			j++;
		}
		milliSecond = System.currentTimeMillis() - milliSecond;
		System.out.printf("%n%d ms만에 파일 복사가 완료되었습니다.%n", milliSecond);
		System.out.printf("복사한 파일의 총 byte 수는 %d입니다.%n", j);
		fis.close();
		fos.close();
	}
}
