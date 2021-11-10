package datatype01;

public class VariableDeclaration {

	public static void main(String[] args) {
		System.out.println("[변수 선언 방법 첫번째]");
		int num;
		num = 10;
		System.out.println(num);
		
		System.out.println("[변수 선언 방법 두번째]");
		int initNum = 100;
		System.out.println(initNum);
		
		System.out.println("[변수 선언 방법 세번째]");
		int fNum, sNum=200;
		fNum = sNum;
		System.out.println(fNum);
		
		int bNum = 0B1010;
		int oNum = 012;
		int hNum = 0xA;
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(hNum);
	}
}
