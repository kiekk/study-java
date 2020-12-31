package pratice_02;

public class Quiz_01 {
	public static void main(String[] args) {
		BiTest test = (a, b) -> a + "와 " + b + "가 매개변수로 넘어왔습니다.";
		
		String a = "김사과";
		String b = "이메론";
		System.out.println(test.apply(a, b));
	}
}

interface BiTest{
	abstract String apply(String a, String b);
}
