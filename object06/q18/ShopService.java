package object06.q18;

public class ShopService {
	// write
	private static ShopService instance = new ShopService();
	
	private ShopService() {}
	
	public static ShopService getInstance() {
		if(instance==null) {
			instance = new ShopService();
		}
		return instance;
	}
}
