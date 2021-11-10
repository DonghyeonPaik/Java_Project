package controlStatement03;

public class DoWhileStatement {
	public static void main(String[] args) {
		/*
		int i=0;
		do {
			i++;
		} while(i<=10);
		System.out.println(i);
		// i값이 11이 출력되는 이유는 while의 조건문에 닿기 전에 do를 실행하기 때문.
		
		int i=1;
		do {
			int j=1;
			while(j<5) {
				if(i==j) System.out.printf("1 ");
				else System.out.printf("0 ");
				j++;
			}
			System.out.printf("(%d,%d)%n", i, i);
			i++;
		} while(i<5);
		
		int i=0;
		do {
			int j=0;
			do {
				System.out.printf("* ");
				j++;				
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<5);
		*/
		
		int i=1;
		do {
			int j=2;
			do {
				System.out.printf("%d * %d = %-5d ", j,i,i*j);
				j++;
			}while(j<10);
			System.out.println();
			i++;
		}while(i<10);
	}
}
