package stream19.inputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileInputStreamTest5 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("resource.txt");
				FileOutputStream fos = new FileOutputStream("resource.txt")){
			fos.write(65);
			fos.write(66);
			fos.write(67);
			fos.write(68);
			fos.write(69);
		}catch(IOException e) {
			System.out.println(e);
		}
	}

}
