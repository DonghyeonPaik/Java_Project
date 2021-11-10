package exception10.custom_Exception;

public class IDFormatTest {
	
	private String userID;
	
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) throws IDFormatException {
		// userID 값이 null이면 사용자 정의 Exception이 발생함
		// userID가 8자리 미만 또는 20자리 초과인 경우: 사용자 정의 Exception이 발생함
		
		if(userID==null) {
			throw new IDFormatException("ID는 null이 될 수 없음.");
		}
		else if(userID.length()<8 || userID.length()>20) {
			throw new IDFormatException("ID는 8자 이상 20자 이하로 작성.");
		}
		this.userID = userID;
	}
	
	
	public static void main(String[] args) {
		IDFormatTest test = new IDFormatTest();
		
		String userID = null;
		try {
			test.setUserID(userID);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
		System.out.println();
		
		userID = "1234567";
		try {
			test.setUserID(userID);
		}catch(IDFormatException e) {
			System.out.println(e.getMessage());
		}
	}
}
