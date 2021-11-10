package exception10.ex;

public class CompleteCalc extends Calculator {
	@Override
	int subtract(int a, int b) {
		return a-b;
	}
	@Override
	double divide(int a, int b) {
		double result = 0;
		try {
			result = a/b;
		}catch(Exception e) {
			System.out.println("===== 가동 종료: Exception 발생 =====");
			e.printStackTrace();
			System.exit(0);
		}
		return result;
	}
}