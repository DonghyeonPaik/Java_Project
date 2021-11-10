package stream19.inputstream;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest4 {

	public static void main(String[] args) {
		try(FileInputStream fis = new FileInputStream("input2.txt")){
			byte[] bs = new byte[10];
			int i;
			while((i=fis.read(bs,0,10))!=-1) {
				for(int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.printf("%n%d바이트 읽음%n",i);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
