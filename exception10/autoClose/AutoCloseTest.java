package exception10.autoClose;

public class AutoCloseTest {

	public static void main(String[] args) {
		// 예외가 발생하지 않는 경우
		
		try(AutoCloseObj obj = new AutoCloseObj()){
			// try(resource){} catch(exception){}
			
		}catch (Exception e) {
			
			e.printStackTrace();
			System.out.println("예외 블럭입니다. ");
		}
		System.out.println("프로그램 종료");
	}

}
