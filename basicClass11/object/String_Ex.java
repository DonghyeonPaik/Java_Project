package basicClass11.object;

public class String_Ex {
	
	public static void main(String[] args) {
		
		// 객체화하여 선언: Heap 영역에 저장됨
		String str1 = new String("홍길동");
		String str2 = new String("홍길동");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str1==str2); // 객체에서의 == 연산자는 주소를 비교함
		System.out.println(str1.equals(str2));
		
		// 객체화하지 않고 선언: 상수풀에 저장됨
		String str3 = "이순신";
		String str4 = "이순신";
		
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3==str4);
		System.out.println(str3.equals(str4));
	}

}
