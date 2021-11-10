package lambda14.lambda.lab01;

public class StringConcatImplements implements StringConcat {

	@Override
	public void makeString(String s1, String s2) {
		System.out.println(s1+", "+s2);
	}
}
