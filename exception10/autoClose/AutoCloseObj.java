package exception10.autoClose;

public class AutoCloseObj implements AutoCloseable {
	// 객체를 자동으로 close하고 싶을 때 사용 가능한 방법: close()를 Override하기
	// try-with-resource 구문을 사용
	
	@Override
	public void close() throws Exception {
		
		System.out.println("리소스가 제거되었습니다.");
	}
	
}
