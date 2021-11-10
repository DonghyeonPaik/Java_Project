package stream19.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamTest {

	public static void main(String[] args) throws IOException {
		
		// 기반 스트림
		// 한 바이트씩 처리하기 때문에 속도가 느림.
		FileInputStream fis = new FileInputStream("C:\\Temp\\e.exe");
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\g.exe");
		
		// 보조 스트림
		// BufferedStream은 RAM을 사용하고, 8KB씩 처리함.
		BufferedInputStream bis = new BufferedInputStream(fis);
		BufferedOutputStream bos = new BufferedOutputStream(fos);
		
		long milliSecond = System.currentTimeMillis();
		
		int i;
		while((i=bis.read())!=-1) {
			bos.write(i);
		}
		
		milliSecond = System.currentTimeMillis() - milliSecond;
		System.out.printf("파일 복사에 성공했습니다. 소요시간은 %dms입니다.%n", milliSecond);
		System.out.println();
		
		bos.close();
		bis.close();
	}
}
