package array05.enum_ex;

public class MainStringArrayArgument {
	
	public static void main(String[] args) {
		if(args.length!=2) {
			System.out.println("프로그램의 사용법");
			
			System.out.printf("반드시 정수값 2개를 srg 인자로 넣으세요: ");
			System.exit(0);
		}
		String strNum1 = args[0];
		String strNum2 = args[1];
		System.out.println(strNum1+strNum2);
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		System.out.println(num1+num2);
		
		System.out.println(strNum1.getClass().getSimpleName());
		System.out.println(((Object)num1).getClass().getSimpleName());
	}
}
