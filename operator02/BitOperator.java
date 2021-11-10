package operator02;

public class BitOperator {
	public static void main(String[] args) {
		
		byte num1 = 45, num2 = 25;
		int result = num1 & num2; // bit 연산의 결과는 integer이기 때문에 byte에 바로 담을 수 없다!
		System.out.println(result); // 101101 & 011001 => 001001
		
		byte b1 = 10, bit1 = 2;
		result = b1 << bit1;
		System.out.println(result); // 1010 << 2 => 101000
		
		b1 = -9;
		result = b1>>bit1;
		System.out.printf("%d>>%d의 결과: %d%n", b1, bit1, result);
		// 00001001 => 11110110 (1의 보수) => 11110111 (2의 보수)
		// 11110111 >> 2 => 11111101 (2의 보수) => 11111100 (1의 보수) => -3
		
	}
}