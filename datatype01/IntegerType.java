package datatype01;

public class IntegerType {
	public static void main(String[] args) {
		byte b1;
		b1 = 127;
		System.out.println(b1);
		
		int i1 = Integer.MAX_VALUE;
		System.out.println(i1);
		
		byte b2 = 20, b3 = 30;
		byte b4 = (byte)(b2 + b3);
		System.out.println(b4);
		
		short s1 = 10000, s2 = 20000;
		short s3 = (short)(s1 + s2);
		System.out.println(s3);
		
		int hex1 = 0x1F;
		System.out.println("0x1F = " + hex1);
		
	}
}
