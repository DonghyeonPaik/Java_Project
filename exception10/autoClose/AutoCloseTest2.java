package exception10.autoClose;

public class AutoCloseTest2 {
	public static void main(String[] args) {
		try(AutoCloseObj obj = new AutoCloseObj()){
			throw new Exception(); // 강제로 예외 발생시킴
			// throw: Exception을 강제로 발생시킴
			// throws: Exception 처리를 미루는 것
			
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("예외처리되었습니다.");
		}
	}
}
