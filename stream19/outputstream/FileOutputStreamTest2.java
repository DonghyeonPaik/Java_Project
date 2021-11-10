package stream19.outputstream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) throws IOException {
		
		File file = new File("C:\\BDH\\workspace\\java\\Kosmo\\temp\\output2.txt");
		file.createNewFile();
		
		try(FileOutputStream fos = new FileOutputStream("C:\\BDH\\workspace\\java\\Kosmo\\temp\\output2.txt")){
			byte[] bs = new byte[26];
			byte data = 65;
			for(int i=0; i<bs.length; i++) {
				bs[i] = data++;
			}
			fos.write(bs);
		}catch(IOException e) {
			System.out.println(e);
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
