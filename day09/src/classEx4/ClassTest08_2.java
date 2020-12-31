package classEx4;
/*
 	static 초기화 블럭
 	클래스 시작시 맨 처음 한번만 실행하는 초기화 블럭
 	static{
 	}
 */
class Score4{
	String name;
	int bun=0;
	static int cnt = 0;
	int kor;
	int eng;
	int math;
//	static int art;
	public void print() {
		System.out.println(bun+"번 : "+name+" // "+kor+" // "+eng+" // "+math +"점");
	}
	static{
		System.out.println("스태틱 초기화 블럭");
		System.out.println("스태틱 초기화 블럭은 인스턴스 만들어지는 횟수와 상관없이, 무조건 한번만 실행됩니다.");
		System.out.println();System.out.println();
		
//		art = 999;
	}
	
	{
		System.out.println("인스턴스 초기화 블럭");
		bun = ++cnt;
		
		name = "미정";
		kor = -1;
		eng = -1;
		math = -1;
	}
	public Score4() {
		name = "기본 생성자";
		kor = -2;
		eng = -2;
		math = -2;
	
	}
}

public class ClassTest08_2 {

	public static void main(String[] args) {
		Score4 std1 = new Score4();
		Score4 std2 = new Score4();
		Score4 std3 = new Score4();
		Score4 std4 = new Score4();
		
		std1.print();
		std2.print();
		std3.print();
		std4.print();
	}//ene main
}//end class
