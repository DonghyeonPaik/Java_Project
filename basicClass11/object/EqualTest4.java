package basicClass11.object;

import java.util.Objects;

class MyDate{
	int day;
	int month;
	int year;
	
	public MyDate() {}
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return year+"년 "+month+"월 "+day+"일입니다.";
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof MyDate) {
			MyDate dt = (MyDate) obj; // 다운캐스팅
			if(day==dt.day && month==dt.month && year==dt.year) {
				return true;
			}
			else return false;
		}
		return false;
	}
	@Override
	public int hashCode() {
		return Objects.hash(day,month,year);
	}
}

public class EqualTest4 {
	
	public static void main(String[] args) {
		MyDate myd = new MyDate(26, 10, 1979);
		System.out.println(myd);
		MyDate myd2 = new MyDate();
		myd2.setDay(26);
		myd2.setMonth(10);
		myd2.setYear(1979);
		System.out.println(myd2);
		System.out.println(myd==myd2); // 주소 비교
		System.out.println(myd.equals(myd2));
		
		System.out.println(myd.hashCode());
		System.out.println(myd2.hashCode());
		
		System.out.println(System.identityHashCode(myd));
		System.out.println(System.identityHashCode(myd2));
	}
}
