package object06.singleton;

public class CompanyExample {
	public static void main(String[] args) {
		
//		Company myCompany1 = new Company(); 이건 틀린 방법!
		
		Company myCompany1 = Company.getInstance();
		Company myCompany2 = Company.getInstance();
		System.out.println(myCompany1==myCompany2);
		
	}
}
