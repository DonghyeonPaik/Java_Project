package basicClass11.object;

public class String_Ex02 {
	
	public static void main(String[] args) {
		String javaStr = new String("Java");
		String androidStr = new String("Android");
		
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소 값: "+System.identityHashCode(javaStr));
		
		javaStr = javaStr.concat(androidStr); // 두 문자열 연결
		System.out.println(javaStr);
		System.out.println("연결한 문자열 주소 값: "+System.identityHashCode(javaStr));
		// concat()의 단점: garbage가 발생함. 별도의 메모리 영역을 새로 생성해서 합치기 때문.
		// 그래서 StringBuilder, StringBuffer 등을 사용하는 게 좋음.
	}
}
