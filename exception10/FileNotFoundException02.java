package exception10;

import java.io.FileInputStream;
import java.io.IOException;

public class FileNotFoundException02 {
	
	// 예외처리 1. throws로 처리: 예외를 미루는 것.
	
	// 예외처리 2. try-catch로 처리
	
	public static void main(String[] args) throws IOException {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("b.txt");
		}catch(Exception e) {
			System.out.println("Excecption: "+e);
			e.printStackTrace();
		}
		fis.close();
	}
}
