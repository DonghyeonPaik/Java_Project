package inheritance07.lab14_p322_p337;

public class ChildExample {
	public static void main(String[] args) {
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		/* 아래는 모두 불가함.
		 * parent.field2() = "data2";
		 * parent.method3(); 
		 * 
		 */
		
		Child child = (Child) parent;
		child.method3();
	}
}
