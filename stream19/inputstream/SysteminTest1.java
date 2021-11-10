package stream19.inputstream;

import java.io.IOException;

public class SysteminTest1 {

	public static void main(String[] args) {
		System.out.println("알파벳 하나를 쓰고 [Enter]를 누르세요 >> ");
		
		try {
			int i = System.in.read();
			// IOException 발생할 수 있음. 그래서 try/catch로 감싸야 함.
			
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
