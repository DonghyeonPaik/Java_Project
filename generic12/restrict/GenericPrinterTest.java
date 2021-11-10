package generic12.restrict;

public class GenericPrinterTest {
	public static void main(String[] args) {
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		System.out.println(plastic);
		plastic.doPrinting();
		plasticPrinter.printing();
		System.out.println("====================");
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		powderPrinter.setMaterial(new Powder());
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		System.out.println(powder);
		powder.doPrinting();
		powderPrinter.printing();
		System.out.println("====================");
		
		// Material을 상속한 객체만 들어올 수 있는데 Water는 Material을 상속하지 않음.
		// 그래서 Error가 나는 것.
//		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
//		waterPrinter.setMaterial(new Water());
//		Water water = waterPrinter.getMaterial();
//		System.out.println(waterPrinter);
//		System.out.println(water);
//		water.doPrinting();
		System.out.println("====================");
	}
}
