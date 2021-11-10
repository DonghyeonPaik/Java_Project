package inheritance07.lab4;

public class VIPCustomer extends Customer {
	private int agentID;
	double saleRatio;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	public VIPCustomer(int customerID, String customerName, int agentID) {
		super(customerID, customerName);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		this.agentID = agentID;
	}
	public int calcPrice(int price) { // 메소드 오버라이딩
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	public int getAgent() {
		return agentID;
	}
}
