package stream19.serialization;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Dog implements Externalizable{
	
	String name;
	int age;
	
	public Dog() {}
	public Dog(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name+", "+age;
	}
	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeUTF(name);
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
	}
	
}

public class ExternalizableTest {

	public static void main(String[] args) throws IOException {
		Dog myDog = new Dog("댕댕이", 3);
		Dog yourDog = new Dog("누렁이", 2);
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\dog.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(myDog);
		oos.writeObject(yourDog);
		oos.close();
		fos.close();
	}
}
