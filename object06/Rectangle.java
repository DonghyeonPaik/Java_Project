package object06;

import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		return width * height;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		Scanner sc = new Scanner(System.in);
		System.out.println(">>");
		
		System.out.printf("너비를 입력하세요: ");
		rect.width = sc.nextInt();
		System.out.printf("높이를 입력하세요: ");
		rect.height = sc.nextInt();
		
		System.out.println("사각형의 면적: "+rect.getArea());
		sc.close();
	}
}
