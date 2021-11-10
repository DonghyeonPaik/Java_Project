package datatype01;

public class TypeCasting {
	public static void main(String[] args) {
		// 묵시적 형변환: 작은 데이터를 큰 자료형에 넣는 경우. 캐스팅 안 해도 됨!
		int hello = 10;
		double hi = hello;
		System.out.println("원래의 integer: "+hello+"  double형에 넣으면: "+hi);
		byte b = 65;
		short s = b;
		int i = b + s;
		System.out.println(i+"bytes 수: "+Integer.BYTES);
		
		// 명시적 형변환: 큰 데이터를 작은 자료형에 넣는 경우. 캐스팅 해야 함!
		hi = 10.1;
		hello = (int)hi;
		System.out.println("원래의 double: "+hi+"  int형에 캐스팅해서 넣으면: "+hello);
		// 명시적 형변환은 데이터의 손실을 일으킬 수 있다.
		hello = 1025;
		byte olleh = (byte)hello;
		System.out.println("원래의 숫자: "+hello+"  캐스팅한 결과: "+olleh);
	}
}