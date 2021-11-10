package generic12.restrict;

public class GenericPrinter<T extends Material> {
	// Material을 상속한 객체만 접근 가능하도록 설정
	
	private T material;
	
	public void setMaterial(T material) {
		this.material = material;
	}
	public T getMaterial(){
		return material;
	}
	public String toString() {
		return material.toString();
	}
	public void printing() {
		material.doPrinting();
	}
}
