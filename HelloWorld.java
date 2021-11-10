import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld{
	public static void main(String[] args){
		System.out.println("Hello World!");
		
		Date date = new Date();
		System.out.println("Today: " + date);
		
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd a hh:mm:ss");
		
		System.out.println("Today: " + format.format(date));
	}
}