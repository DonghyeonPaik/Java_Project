package controlStatement03;

import java.io.IOException;

public class WhileStatement {
	public static void main(String[] args) throws IOException{
		/*
		int i=1, sum=0;
		while(i<1001) {
			if(i%3==0^i%5==0) sum += i;
			i++;
		}
		System.out.println(sum);
		
		System.out.printf("문자열을 입력하세요: ");
		char word;
		while((word=(char)System.in.read())!=13) {
			System.out.println(word);
		}
		System.out.println();
		
		int i=1, j=1;
		while(i<5) {
			while(j<5) {
				if(i==j) System.out.printf("1 ");
				else System.out.printf("0 ");
				j++;
			}
			System.out.printf("(%d,%d)%n", i, i);
			i++;
			j=1;
		}
		
		int i=0, j=0;
		while(i<5) {
			while(j<=i) {
				System.out.printf("* ");
				j++;
			}
			System.out.printf("%n");
			i++;
			j=0;
		}
		
		int i=0, j=0;
		while(i<5) {
			while(j<5) {
				if(i<=j) System.out.printf("* ");
				else System.out.printf("  ");
				j++;
			}
			System.out.printf("%n");
			i++;
			j=0;
		}
		*/
		
		int i=1;
		while(i<10) {
			int j=2;
			while(j<10) {
				System.out.printf("%d * %d = %-5d ", j, i, i*j);
				j++;
			}
			System.out.println();
			i++;
		}
	}
}
