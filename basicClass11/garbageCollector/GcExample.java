package basicClass11.garbageCollector;

class Employee{
	public int eno;
	public Employee(int eno) {
		this.eno = eno;
		System.out.println("Employee ("+eno+")가 메모리에 생성됨");
	}
	@Override
	protected void finalize() throws Throwable{
		// 메모리에서 제거될때 호출됨
		System.out.println("Employee ("+eno+")가 메모리에서 제거됨");
	}
}

public class GcExample {
	
	public static void main(String[] args) {
		Employee emp = new Employee(1);
		// stack에 emp와 포인터 저장, heap에 eno값인 1이 저장됨
		
		emp = null;
		// emp를 null로 만들어서 포인터를 null로 바꾸면 heap와의 연결이 끊어짐
		// 즉, heap 영역에 garbage가 발생하게 됨 [사용하지 않는데 할당된 메모리 공간 발생]
		
		emp = new Employee(2);
		emp = new Employee(3);
		// emp에 새로운 객체를 지정하면 기존 객체가 만든 heap 공간이 garbage가 됨.
		
		System.out.printf("emp가 최종적으로 참조하는 사원번호: ");
		System.out.println(emp.eno);
		System.gc();
		// 그래서 두 개의 garbage가 제거됨
	}
}
