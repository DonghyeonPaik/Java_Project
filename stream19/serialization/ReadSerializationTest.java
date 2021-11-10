package stream19.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadSerializationTest { // .dat 파일의 객체 출력

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\serial.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		// .dat에 들어있는 Object를 읽어옴
		Person p1 = (Person) ois.readObject();
		Person p2 = (Person) ois.readObject();
		
		System.out.println(p1);
		System.out.println(p2);
		
		ois.close();
		fis.close();
	}

}
