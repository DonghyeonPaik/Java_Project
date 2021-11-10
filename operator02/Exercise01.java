package operator02;

public class Exercise01 {

	public static void main(String[] args) {
		int num1 = 9, num2 = 7, num3 = -1;
		byte byte1 = 127;
		System.out.println(~byte1); // 1의 보수 연산 01111111(127) => 10000000(-128)
		System.out.println(num1<<3); // 1001 => 1001000
		System.out.println(num2>>1); // 111 => 11
		// >>> 연산은 >>와 다르게 부호 비트까지 shifting.
		System.out.println(num3>>>30); // 111...111 => 000...011
		System.out.println();

		// /은 몫 산출, %는 나머지 산출!
		System.out.println(num1/num2);
		System.out.println(num1%num2);
		// +=, %= 등은 왼쪽항에 결과가 저장됨.
		System.out.println(num3 = (num1+=num2));
		num3 = (num1/=num2);
		System.out.println(num3);
		num3 = (num1%=num2);
		System.out.println(num3);
		System.out.println(0==1);
		System.out.println((num1<=num2)&&(num2>=num3));
		boolean boo;
		System.out.println(boo = (num1>=num2)||(num2==num3));
		System.out.println(!boo);
		System.out.println();

		int number1 = 1, number2 = 2;
		boolean boo1;
		// 아래의 AND 연산은 왼쪽항이 이미 false이므로 오른쪽항을 skip한다.
		// 그래서 오른쪽항에 적힌 number1의 변화는 반영되지 않는다!
		boo1 = (number1+number2)>(number2+=number2) && number1<(number1+=number1);
		System.out.println(boo1);
		System.out.println(number1);
		System.out.println(number2);
		// 아래의 OR 연산은 왼쪽항이 이미 true이므로 오른쪽항을 skip한다.
		// 그래서 오른쪽항에 적힌 number2의 변화는 반영되지 않는다!
		boo1 = (number1+=number1)<=number2 || (number2*=2)==8;
		System.out.println(boo1);
		System.out.println(number1);
		System.out.println(number2);
		System.out.println();
		int bit1=15, bit2=14;
		// &=: bit끼리 AND 연산
		int sum1 = bit1&=bit2; // 1111 &= 1110 => 1110
		System.out.println(sum1);
		bit1 = 15;
		// |=: bit끼리 OR 연산
		sum1 = bit1|=bit2; // 1111 |= 1110 => 1111
		System.out.println(sum1);
		bit1 = 15;
		// ^=: bit끼리 XOR 연산
		sum1 = bit1^=bit2; // 1111 ^= 1110 => 0001
		System.out.println(sum1);
	}
}