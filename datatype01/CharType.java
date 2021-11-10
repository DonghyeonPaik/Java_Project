package datatype01;

public class CharType {
	public static void main(String[] args) {
		
		char c1 = 'A', c2 = 65, c3 = 0B100001;
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		
		char c4 = '가';
		char c5 = '나';
		System.out.println(c4);
		System.out.println(c5);
		
		System.out.println((int)c5);
		
		int num1 = 2;
		System.out.println((char)(c1+num1));
		
	}
}
