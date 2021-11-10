package stream19.serialization;

import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

class Animal implements Externalizable{
	String name;
	int age;
	
	public Animal() {}
	public Animal(String name, int age) {
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
		out.writeInt(age);
	}
	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		age = in.readInt();
	}
}

public class Lab2_Externalizable {

	public static void main(String[] args) throws IOException {
		Animal lion = new Animal("Lion", 10);
		Animal tiger = new Animal("Tiger", 20);
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\Animal.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(lion);
		oos.writeObject(tiger);
		oos.close();
		fos.close();
		System.out.println(".dat 파일 생성 완료");
	}
}