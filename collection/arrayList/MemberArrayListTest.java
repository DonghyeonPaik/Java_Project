package collection.arrayList;

import collection.Member;

public class MemberArrayListTest {

	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		// Member 객체 생성
		Member memberLee = new Member(1001, "이지원");
		Member memberSon = new Member(1002, "손민국");
		Member memberPark = new Member(1003, "박서원");
		Member memberHong = new Member(1004, "홍길동");
		Member memberSon2 = new Member(1002, "손민국");
		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		memberArrayList.addMember(memberSon2);
		/*
		 * ArrayList의 특징
		 * 1. index를 가지고 있음. 그래서 순차적으로 저장 및 출력 가능
		 * 2. 중복된 값 저장 가능.
		 * 3. 가변적인 배열 크기(갯수)
		 * 4. 중간의 요소를 삭제할 경우 뒤의 요소들을 자동으로 당겨옴
		 * 5. 중간에 삽입할 경우 뒤의 요소들을 자동으로 밀어냄
		 */
		
		memberArrayList.showAllMember();
		System.out.println("=====서로 내용이 같은지 확인=====");
		memberSon.equals(memberLee);
		memberSon.equals(memberSon2);
		System.out.println();
		System.out.println("=====중간에 있는 요소 제거=====");
		memberArrayList.removeMember(1003);
		memberArrayList.showAllMember();
		memberArrayList.removeMember(1002);
		memberArrayList.showAllMember();
		memberArrayList.removeMember(1005);
		memberArrayList.showAllMember();
		System.out.println("=====index 1번에 삽입=====");
		memberArrayList.addMember2(1, new Member(1005, "최명길"));
		memberArrayList.showAllMember();
	}
}
