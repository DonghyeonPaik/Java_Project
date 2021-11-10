package stream19.serialization;

// import java.io.*; 으로 대체 가능!
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable{
	private static final long serialVersionUID = 12352625246245256L;
	String name;
	int id;
	String phoneNumber;
	String email;
	
	public Student() {}
	public Student(String name, int id, String phoneNumber, String email) {
		this.name = name;
		this.id = id;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	@Override
	public String toString() {
		return "name: "+name+", id: "+id+", phoneNumber: "+
				phoneNumber+", email: "+email;
	}
}

public class Lab1_Serialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Student studentKim = new Student("Kim", 111, "0100100110", "a@a.com");
		Student studentPark = new Student("Park", 222, "0100100111", "b@b.com");
		Student studentLee = new Student("Lee", 333, "0100100112", "c@c.com");
		
		FileOutputStream fos = new FileOutputStream("C:\\Temp\\studentList.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(studentKim);
		oos.writeObject(studentPark);
		oos.writeObject(studentLee);
		
		System.out.println("Serialization Success");
		oos.close();
		fos.close();
		
		FileInputStream fis = new FileInputStream("C:\\Temp\\studentList.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Student s;
		try {
			while((s=(Student)ois.readObject()) != null) {
				System.out.println(s);
			}
		}catch(EOFException e) {
			System.out.println("파일 안의 Object를 모두 탐색했습니다.");
		}
		ois.close();
		fis.close();
	}

}
