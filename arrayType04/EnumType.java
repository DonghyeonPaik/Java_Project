package arrayType04;

import java.util.Calendar;

public class EnumType {
	public static void main(String[] args) {
		Week today;
		today = Week.SUNDAY;
		System.out.println("today: "+Week.MONDAY);
		
		// name() method
		String name = today.name();
		System.out.println("name: "+name);
		
		// ordinal() method: 몇 번째 객체인지를 return해줌.
		System.out.println("ordinal: "+today.ordinal());
		
		// compareTo() method: 같으면 0, 크면 차이나는 만큼 +1, 작으면 -1씩 적용해서 return
		Week day1 = Week.MONDAY;
		Week day2 = Week.TUESDAY;
		
		int result = day1.compareTo(day2);
		System.out.println("result: "+result);
		
		// valueOf(매개변수) method: 겹치는 문자열인 객채를 return
		Week weekDay = Week.valueOf("SATURDAY");
		System.out.println("weekday: "+weekDay);
		
		// Calendar를 통해서 현재 날짜를 불러올 수 있다!
		Calendar cal = Calendar.getInstance();
		int wk = cal.get(Calendar.DAY_OF_WEEK);
		switch(wk) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		System.out.println("오늘의 요일: "+today);
	}
}
