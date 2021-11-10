package stream19.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lab2_ExternalizableRead {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\Animal.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Animal a1 = (Animal) ois.readObject();
		Animal a2 = (Animal) ois.readObject();
		System.out.println(a1);
		System.out.println(a2);
		
		ois.close();
		fis.close();
	}
}
