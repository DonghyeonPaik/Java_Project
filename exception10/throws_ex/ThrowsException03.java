package exception10.throws_ex;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException03 {

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
			Class d = test.loadClass("C:\\test\\input.txt", "java.lang.String");
			System.out.println(d.getClasses());
			d.getClass();
		} catch (FileNotFoundException e) {
			System.out.println(e);
			System.out.println("파일이 없음");
		} catch (ClassNotFoundException e) {
			// 동적 로딩이 적용되어 나중에 확인함
			System.out.println(e);
			System.out.println("클래스 파일이 없음");
		} catch (Exception e) { // 그 외 모든 Exception 처리
			System.out.println(e);
		}
		System.out.println("프로그램 종료");
	}
}
