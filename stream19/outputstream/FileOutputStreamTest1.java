package stream19.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest1 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\BDH\\workspace\\java\\Kosmo\\temp\\output.txt");
		file.createNewFile();
		
		try(FileOutputStream fos = new FileOutputStream(
				"C:\\\\BDH\\\\workspace\\\\java\\\\Kosmo\\\\temp\\\\output.txt")){
			fos.write(65);
			fos.write(66);
			fos.write(67);
		}catch(IOException e) {
			System.out.println(e);
		}
	}
}