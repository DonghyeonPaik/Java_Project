package array05.enum_ex;

import java.util.Calendar;

public class EnumWeekExample {
	
	public static void main(String[] args) {
		Week today = null;
		
		Week nextDay = Week.SATURDAY;
		if(nextDay==Week.SATURDAY) System.out.println("같은 주소 참조");
		// nextDay는 stack에 생성되고, Week enum객체의 SATURDAY의 주소값을 저장함.
		// 메소드 영역에 있는 enum객체 Week가 가리키는 상수 SATURDAY의 주소값과 같아서
		// 두 변수 또는 상수가 가리키는 주소값이 서로 같으므로 true가 된다.
		
		Calendar calendar = Calendar.getInstance();
		// 메소드를 호출해서 사용할 객체 생성 [singleton]
		int week = calendar.get(Calendar.DAY_OF_WEEK); // 요일을 숫자로 얻음
		// DAY_OF_WEEK: 일요일은 1로, 월요일은 2, ... 로 return해줌
		System.out.println(week);
		
		switch(week) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		
		}
		System.out.println("오늘은 "+today+"입니다. ");
		
		if(today==Week.SUNDAY) {
			System.out.println("일요일에는 축구를 합니다.");
		}else {
			System.out.println("Java 공부를 합니다.");
		}
	}
}
