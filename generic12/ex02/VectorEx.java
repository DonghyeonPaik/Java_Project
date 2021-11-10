package generic12.ex02;

import java.util.Vector;

public class VectorEx {
	
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100); // index가 2인 객체 칸에 100을 집어넣음. -1은 index 3으로 옮겨짐.
		// 즉, 5, 4, 100, -1 이렇게 Vector v 안에 들어있는 것.
		
		System.out.println("벡터 내의 요소 객체 갯수: "+v.size());
		System.out.println("벡터의 현재 용량: "+v.capacity());
		
		int sum = 0;
		for(int i=0; i<v.size(); i++) {
			int n = v.get(i);
			sum += n;
		}
		System.out.println("벡터에 있는 정수의 합: "+sum);
	}
}
