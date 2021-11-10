package stream19.other;

import java.io.File;
import java.io.IOException;

public class FileTest {

	public static void main(String[] args) {
		File file = new File("newFile.txt");
		try {
			file.createNewFile(); // 지정된 경로에 파일을 생성시킴
			System.out.println(file.isFile()); // 지정된 경로에 파일이 있으면 true
			System.out.println(file.isDirectory()); // 폴더면 true, 파일이면 false
			System.out.println(file.getName()); // 파일 이름[+확장자]을 불러옴
			System.out.println(file.getAbsolutePath()); // 절대 경로 출력
			System.out.println(file.getPath()); // 패키지에서의 경로 출력
			System.out.println(file.canRead()); // 읽을 권한이 있는지
			System.out.println(file.canWrite());
			
			file.delete();
			System.out.println(file.isFile());
			
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
