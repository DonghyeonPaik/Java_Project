package basicClass11.garbageCollector;

public class Counter {
	// Garbage는 메모리의 사용하지 않는 객체들을 일컫는 말.
	// C나 C++과는 달리 JAVA는 JVM이 Garbage Collector를 통해서 자동으로 해줌.
	private int no;
	public Counter(int no) {
		this.no = no;
	}

	// finalize()는 garbage collecting을 할 때 반드시 호출되는 메소드.
	@Override
	protected void finalize() throws Throwable{
		System.out.println(no+"번째의 finalize()가 실행됨");
	}
}
