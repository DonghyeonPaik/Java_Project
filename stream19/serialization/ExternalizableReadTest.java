package stream19.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ExternalizableReadTest {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\dog.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Dog d1 = (Dog) ois.readObject();
		Dog d2 = (Dog) ois.readObject();
		
		System.out.println(d1);
		System.out.println(d2);
		ois.close();
		fis.close();
	}

}
