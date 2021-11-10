package collection;

public class Member2 implements Comparable<Member2>{
	// TreeSet을 쓰러면 Comparable을 implements해서 중복 없애고 정렬해줘야 함.
	// compareTo()랑 equals()를 Override해야 함
	
	// field
	private int memberID;
	private String memberName;
	
	// constructor
	public Member2(int memberID, String memberName) {
		this.memberID = memberID;
		this.memberName = memberName;
	}
	
	// getter and setter
	public int getMemberID() {return memberID;}
	public void setMemberID(int memberID) {this.memberID = memberID;}
	public String getMemberName() {return memberName;}
	public void setMemberName(String memberName) {this.memberName = memberName;}
	
	// Override methods
	@Override
	public String toString() {
		return memberName+" 회원님의 아이디는 "+memberID+"입니다.";
	}
	@Override
	public boolean equals(Object obj) { // Object로 업캐스팅
		// 원래의 equals는 객체의 주소를 비교하지만
		// Override로 객체 내의 memberID를 비교하는 것으로 고쳐서 사용
		
		if(obj instanceof Member2) {
			Member2 member = (Member2)obj; // Member로 다운캐스팅
			if(this.memberID==member.memberID && this.memberName==member.memberName) {
				System.out.println("동일한 회원(객체)입니다.");
				return true;
			}else {
				System.out.println("동일하지 않은 회원(객체)입니다.");
				return false;
			}
		}
		System.out.println("비정상적인 접근입니다.");
		return false;
	}
	@Override
	public int hashCode() {
		return memberID;
	}
	@Override
	public int compareTo(Member2 member) { // 정렬 기준 설정
		return this.memberID-member.memberID; // 오름차순 정렬 [a ~ z]
		// (this.memberID-member.memberID)*(-1): 내림차순 정렬 [z ~ a]
	}
}
