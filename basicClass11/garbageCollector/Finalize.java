package basicClass11.garbageCollector;

public class Finalize {

	public static void main(String[] args) throws InterruptedException {
		Counter count = null;
		for (int i=1; i<50; i++) {
			count = new Counter(i);
			count = null; // 객체를 garbage로 만듦
			Thread.sleep(5);
			System.gc(); // 수동으로 garbage collector 호출
		}
	}

}
