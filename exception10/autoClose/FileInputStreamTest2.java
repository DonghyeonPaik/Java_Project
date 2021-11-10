package exception10.autoClose;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 { // AutoClose를 사용함

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("C:\\test\\input.txt")){
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
}