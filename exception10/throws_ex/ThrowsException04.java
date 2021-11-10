package exception10.throws_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException04 {

	public Class loadClass(String fileName, String className)
			throws FileNotFoundException, ClassNotFoundException {
		// return type이 Class type이라는 것!
		
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		// Class.forName(전체 클래스): 동적 로딩 지원. 클래스 전체 이름에서 존재하는지 확인
		// 동적 로딩: 컴파일 시 이름을 확인하지 않고 실행 시에 이름 확인
		
		return c;
	}
	
	public static void main(String[] args) {
		
		ThrowsException test = new ThrowsException();
		// throws Exception을 처리하는 객체 생성
		/*
		try {
			test.loadClass("a.txt", "java.lang.String1");
		} catch (FileNotFoundException | ClassNotFoundException e) {
			// Multi-catch
			System.out.println(e);
		}
		*/
		try { // Surround catch: 각각의 Exception에 대해 따로 처리
			Class d = test.loadClass("C:\\test\\input.txt", "java.lang.String2");
			System.out.println(d.getClasses());
			d.getClass();
		} catch (Exception e) {
		// Exception을 한꺼번에 처리할 순 있으나 세부적인 control이 힘듦.
			System.out.println(e);
		}
		System.out.println("프로그램 종료");
	}
}
