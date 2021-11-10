package stream19.decorator;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataStreamTest {

	public static void main(String[] args) throws IOException {
		
		// 기반 스트림
		FileInputStream fis = new FileInputStream("C:\\Temp\\data.txt");
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\data.txt");
		
		// 보조 스트림 중에서 DataStream: 다양한 형식의 자료형을 처리 가능, 단 output 주의
		// 여기서의 기반 스트림과 보조 스트림 둘 다 바이트 스트림이다!
		// 그래서 .txt 파일에는 막상 이상한 유니코드가 적혀져있다!
		DataInputStream dis = new DataInputStream(fis);
		DataOutputStream dos = new DataOutputStream(fos);
		
		dos.writeByte(100);
		dos.writeChar('A');
		dos.write(10);
		dos.writeFloat(3.14F);
		dos.writeDouble(3.141592);
		dos.writeUTF("안녕하세요."); // String을 입력
		
		System.out.println(dis.readByte());
		System.out.println(dis.readChar());
		System.out.println(dis.read());
		System.out.println(dis.readFloat());
		System.out.println(dis.readDouble());
		System.out.println(dis.readUTF());
		
		dis.close();
		dos.close();
	}

}
