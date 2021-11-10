package stream19.writer;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		FileWriter fw = new FileWriter("writer.txt");
		
		fw.write('A'); // 한 바이트 write
		char[] buf = {'B', 'C', 'D', 'E', 'F', 'G'};
		fw.write(buf); // 배열 요소들을 write
		fw.write('\n');
		fw.write("안녕하세요 자바 프로그래밍 시간입니다.");
		fw.write('\n');
		fw.write(buf,1,2);
		fw.write('\n');
		fw.write(65);
		fw.write("65");
		fw.close();
		System.out.println("정상적으로 파일에 출력되었습니다.");
	}

}
