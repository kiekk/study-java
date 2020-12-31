package pratice_02;

public class Test_08 {
	public static void main(String[] args) {
		HelloYourName1 yourName1 = Hello::new;
		System.out.println(yourName1.get().getName());
		
		HelloYourName2 yourName2 = Hello::new;
		System.out.println(yourName2.get("이메론").getName());
	}
}

interface HelloYourName1{
	Hello get();
}

interface HelloYourName2{
	Hello get(String name);
}

class Hello {
	private String name;
	
	public Hello() {
		this.name = "김사과";
		System.out.println("인자 없는 생성자 호출");
	}
	public Hello(String name) {
		this.name = name;
		System.out.println("인자 있는 생성자 호출");
	}
	
	public String getName() {
		return name;
	}
}
