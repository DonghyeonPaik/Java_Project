package generic12.ex02;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapScoreEx {
	public static void main(String[] args) {
		HashMap<String, Integer> javaScore = new HashMap<String, Integer>();
		
		javaScore.put("김성동", 97);
		javaScore.put("황기태", 88);
		javaScore.put("김남윤", 98);
		javaScore.put("이재문", 70);
		javaScore.put("한원선", 99);
		
		System.out.println("HashMap에 저장된 요소의 갯수: "+javaScore.size());
		
		Set<String> keys = javaScore.keySet(); // 모든 이름과 점수를 출력가능하도록
		
		Iterator<String> it = keys.iterator(); // 순환 출력을 가능하게 함
		
		while(it.hasNext()) {
			String name = it.next();
			int score = javaScore.get(name);
			System.out.println(name+" "+score);
		}
	}
}
