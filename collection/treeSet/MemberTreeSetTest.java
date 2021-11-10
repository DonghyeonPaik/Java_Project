package collection.treeSet;

import collection.Member2;

public class MemberTreeSetTest {

	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member2 memberPark = new Member2(1001, "박서원");
		Member2 memberLee = new Member2(1002, "이순신");
		Member2 memberKang = new Member2(1003, "강감찬");
		Member2 memberKim = new Member2(900, "김유신");
		Member2 memberSong = new Member2(930, "송유나");
		
		memberTreeSet.addMember(memberPark);
		memberTreeSet.addMember(memberLee);
		memberTreeSet.addMember(memberKang);
		memberTreeSet.addMember(memberKim);
		memberTreeSet.addMember(memberSong);
		memberTreeSet.showAllMember();
		
		System.out.println("===== 내용이 같은 객체 추가하는 경우 =====");
		Member2 memberSong2 = new Member2(930, "송유나");
		Member2 memberSong3 = new Member2(930, "송유나");
		memberTreeSet.addMember(memberSong2);
		memberTreeSet.addMember(memberSong3);
		memberTreeSet.showAllMember();
	}
}
