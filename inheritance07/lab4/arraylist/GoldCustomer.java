package inheritance07.lab4.arraylist;

public class GoldCustomer extends Customer {
	
	double saleRatio; // 판매 가격 할인 비율
	
	public GoldCustomer(int customerID, String customerName) {
		
		super(customerID, customerName); // 부모 생성자로부터 받아옴
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.05;
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*saleRatio);
	}
}
