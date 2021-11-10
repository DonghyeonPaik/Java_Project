package operator02;

public class ComparisonOperator {
	public static void main(String[] args) {
		System.out.println(10 == 10.0); // 소수점 이하가 0이면 서로 같다고 인식.
		System.out.println(10.1d == 10.1f);
		// double과 float가 담는 소수부 크기가 다르기 때문.
		System.out.println(10.0d);
		System.out.println((double)10.0f);
		// 소수점 아래가 모두 0이면 서로 같은 숫자로 인식함.
		System.out.println(10.1d);
		System.out.println((double)10.1f);
		// 소수점 아래가 있으면 서로 표시할 수 있는 자리수 차이로 인해 (비교를 위해서 캐스팅하므로)
		// 두 숫자가 서로 다른 숫자로 인식됨.
		
		boolean b =!true||true^false&&true;
		// (!true) || (true^false) && true => false||true&&true => true&&true
		System.out.println(b);
	}
}
