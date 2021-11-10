package array05.enum_ex;

public class EnumMethodExample {
	public static void main(String[] args) {
		// String[] args: String형 배열 args라는 인자를 받는다는 것.
		
		Week today = Week.SUNDAY;
		String name = today.name();
		System.out.println(name);
		
		// ordinal(): 몇번째 객체인지를 알려줌.
		int ordinal = today.ordinal();
		System.out.println(ordinal);
		
		// compareTo(): 몇번째에 위치하는지를 비교함. 서로의 순번을 뺄셈 연산.
		Week day1 = Week.MONDAY;
		Week day2 = Week.WEDNESDAY;
		int result1 = day1.compareTo(day2);
		int result2 = day2.compareTo(day1);
		System.out.println(result1);
		System.out.println(result2);
		
		// valueOf(): 주어진 문자열과 동일한 문자열을 가진 열거 객체를 return함.
		if(args.length==1) {
			String strDay = args[0];
			Week weekDay = Week.valueOf(strDay);
			if(weekDay==Week.SATURDAY || weekDay==Week.SUNDAY) {
				System.out.println("주말입니다.");
			}else{
				System.out.println("평일입니다.");
			}
		}
		System.out.println("=========================");
		
		for(String a: args) {
			System.out.println(a);
		}
		System.out.println("=========================");
		
		// values(): 열거 타입의 모든 열거 객체들을 배열로 return함.
		Week[] days = Week.values();
		for(Week day: days) {
			System.out.println(day);
		}
	}
}
