package collection.hashSet;

import collection.Member;

public class MemberHashSetTest {

	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		Member memberLee = new Member(1001, "홍길동");
		Member memberHong = new Member(1002, "이순신");
		Member memberKim = new Member(1003, "김길동");
		Member memberKim2 = new Member(1003, "김길동");
		Member memberKim3 = new Member(1003, "김길동");
		
		System.out.println("===== HashSet에 객체 저장 =====");
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberHong);
		memberHashSet.addMember(memberKim);
		memberHashSet.showAllMember();
		
		System.out.println("===== HashSet에 중복 객체 저장 시도 =====");
		memberHashSet.addMember(memberKim2);
		memberHashSet.addMember(memberKim3);
		memberHashSet.showAllMember();
		// equals()를 Override했기 때문에 중복 저장이 안됨
		
		System.out.println("===== HashSet에서 객체 삭제 =====");
		memberHashSet.removeMember(1003);
		memberHashSet.showAllMember();
	}
}
