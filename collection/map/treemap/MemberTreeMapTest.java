package collection.map.treemap;

import collection.Member2;

public class MemberTreeMapTest {

	public static void main(String[] args) {
		MemberTreeMap memberTreeMap = new MemberTreeMap();
		
		Member2 memberPark = new Member2(1001, "Park");
		Member2 memberSong = new Member2(1002, "Song");
		Member2 memberKim = new Member2(1003, "Kim");
		Member2 memberSon = new Member2(1004, "Son");
		
		memberTreeMap.addMember(memberPark);
		memberTreeMap.addMember(memberSong);
		memberTreeMap.addMember(memberKim);
		memberTreeMap.addMember(memberSon);
		memberTreeMap.showAllMember();
		
		System.out.println("===== 객체 삭제 =====");
		memberTreeMap.removeMember(1002);
		memberTreeMap.removeMember(memberSon.getMemberID());
		memberTreeMap.showAllMember();
	}
}
