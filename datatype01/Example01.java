package datatype01;

public class Example01 {

	public static void main(String[] args) {
		
		System.out.println("=====================================");
		System.out.printf("%-6s%-6s%-6s%-6s%-7s%-6s%n", "name", "kor", "eng", "math", "total", "avg");
		System.out.println("=====================================");
		System.out.printf("%-6s%-6s%-6s%-6s%-7s%-6.2f%n",
				"HONG", 95, 70, 90, 95+70+90, (95+70+90)/3.0);
		System.out.printf("%-6s%-6s%-6s%-6s%-7s%-6.2f%n",
				"KIM", 90, 85, 80, 90+85+80, (90+85+80)/3.0);
		System.out.printf("%-6s%-6s%-6s%-6s%-7s%-6.2f%n",
				"PARK", 85, 98, 97, 85+98+97, (85+98+97)/3.0);
	}
}