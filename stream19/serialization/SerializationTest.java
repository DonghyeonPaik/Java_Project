package stream19.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

// Serialization: 객체(인스턴스)를 파일에 저장하는 것 [직렬화]
// Serializable 또는 Externalizable 인터페이스를 구현한 객체만 Serialization 가능함!
// Serializable: 간단한 컨트롤로 직열화
// Externalizable: 세부적인 컨트롤을 통한 직열화 [메소드 제공됨]

class Person implements Serializable{
	// field
	private static final long serialVersionUID = 32534653643534634L;
	String name;
	String job;
	
	// constructor
	public Person() {}
	
	public Person(String name, String job) {
		this.name = name;
		this.job = job;
	}
	
	// method
	@Override
	public String toString() {
		return name+", "+job;
	}
}

public class SerializationTest {
	public static void main(String[] args) throws IOException {
		Person personAhn = new Person("안재용", "대표이사");
		Person personKim = new Person("김철수", "상무이사");
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\serial.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(personKim);
		oos.writeObject(personAhn);
		System.out.println("Serialization Success");
		oos.close();
		fos.close();
	}
}
