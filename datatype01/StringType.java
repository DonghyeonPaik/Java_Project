package datatype01;

public class StringType {

	public static void main(String[] args) {
		/*
		 * String은 기본 자료형이 아닌 참조형임.
		 * Java에서 문자열을 나타낼 때에는 double quotation("")으로 감싼다.
		 * String에서 +는 String의 연결을 뜻함.
		 * 문자열 + 숫자는 문자열임.
		 */
		int number = 99;
		/*
		 * String strNum = (String)number;
		 * int StringToNum = (int)"100";
		 * 위와 같은 식으로 작성할 수 없다!
		 * 즉, 기본 자료형과 참조형은 서로 casting이 안 된다!
		 * 그래서 굳이 정수를 String으로 저장하려면 아래와 같이 작성해야 함.
		 */
		String stringToNumber1 = 99 + "";
		System.out.println(stringToNumber1);
		String stringToNumber2 = "99";
		System.out.println(stringToNumber2);
		// 정수 + 문자열 => 문자열
		System.out.println(number+stringToNumber1);
		System.out.println(number+stringToNumber2);
		
		// new를 이용해서 문자열 저장. Heap 영역에 저장됨.
		String newString = new String("new 연산자 사용");
		System.out.println(newString);
		// 일반적인 자료형처럼 선언할수도 있음.
		String declareLikeBasicType = "일반적인 자료형처럼 문자열 저장";
		System.out.println(declareLikeBasicType);
		
		// 문자열 + 문자열
		String sumOfString = newString +" 또는 "+ declareLikeBasicType;
		System.out.println(sumOfString);
		
		int kor = 89, eng = 99, math = 78;
		System.out.println("총점: "+kor+eng+math);
		// String과의 덧셈은 string이 된다는 것을 깜빡하면 위와 같은 실수를 함.
		System.out.println("총점: "+(kor+eng+math));
		System.out.printf("총점: %d\n", kor+eng+math);
		// 위와 같은 방식으로 나타낼 수 있음.
	}
}