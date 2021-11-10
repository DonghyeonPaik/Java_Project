package inheritance07.lab4;

public class CustomerTest4 {
	public static void main(String[] args) {
		Customer vc = new VIPCustomer(10030, "홍길동", 2000);
		// 업캐스팅: 자식객체를 만들어서 부모 객체 타입으로 형식 변환.
		// 상위 클래스 형 Customer로 선언하고 하위 클래스 형 VIPCustomer를 호출.
		vc.bonusPoint = 1000;
		
		System.out.println(vc.getCustomerName()+"님이 지불해야 할 금액은 "+
				vc.calcPrice(10000));
	}
}
