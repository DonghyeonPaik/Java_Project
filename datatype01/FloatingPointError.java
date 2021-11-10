package datatype01;

import java.math.BigDecimal;

public class FloatingPointError {
	public static void main(String[] args) {
		double num1 = 0.1;
		double num2 = 0.2;
		double sum = num1 + num2;
		System.out.println(sum);
		System.out.println("0.3과 같다?: "+(sum==0.3));
		// 부동소수점 오류가 발생해서 정확한 계산 결과인 0.3을 내놓지 않음. 논리적으로도 거짓임.
		/* 
		 * 왜냐하면 지수부를 binary bits로 저장하기 때문에
		 * 32비트의 경우 24번째 자리에서 반올림이 생김.
		 * 그래서 근사값을 저장하게 됨.
		 * 
		 * 이 문제를 해결하기 위해서는 BigDecimal을 사용해야 함.
		 * 
		 */
		System.out.printf("\n");
		BigDecimal big1 = new BigDecimal("0.1");
		BigDecimal big2 = new BigDecimal("0.2");
		BigDecimal big3 = big1.add(big2);
		System.out.println("BigDecimal을 사용한 결과: "+big3);
		// BigDecimal은 == 가 안 통함. 그래서 compareTo를 사용해서 비교해야 함.
		// 크면 1, 작으면 -1, 같으면 0을 반환함.
		System.out.println("0.3과 같다?: "+(
				0==big3.compareTo(new BigDecimal("0.3"))
				));
	}
}
