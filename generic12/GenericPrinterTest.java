package generic12;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		
		powderPrinter.setMaterial(new Powder());
		
		Powder powder = powderPrinter.getMaterial();
		System.out.println(powderPrinter);
		System.out.println(powder);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		plasticPrinter.setMaterial(new Plastic());
		
		Plastic plastic = plasticPrinter.getMaterial();
		System.out.println(plasticPrinter);
		
		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		Water water = new Water();
		waterPrinter.setMaterial(water);
		water = waterPrinter.getMaterial();
		System.out.println(water);
	}
}
