package classEx4;
/*
 	인스턴스 초기화 블럭
 	
 	한 클래스에, 인스턴스 초기화 블럭 + 생성자가 동시에 있다면?
 	
 	초기화 순서는?
 	1. 인스턴스초기화블럭 실행하고 나서 -> 2. 생성자로 넘어가서 또 생성자 안에 있는 소스를 실행합니다.
 */
class Score3{
	String name;
	int bun=0;
	static int cnt = 0;
	int kor;
	int eng;
	int math;
	public void print() {
		System.out.println(bun+"번 : "+name+" // "+kor+" // "+eng+" // "+math +"점");
	}
	
	{
		System.out.println("인스턴스 초기화 블럭");
		bun = ++cnt;
		
		name = "미정";
		kor = -1;
		eng = -1;
		math = -1;
	}
	public Score3() {
		name = "기본 생성자";
		kor = -2;
		eng = -2;
		math = -2;
	
	}
}

public class ClassTest08_1 {

	public static void main(String[] args) {
		Score3 std1 = new Score3();
		Score3 std2 = new Score3();
		Score3 std3 = new Score3();
		Score3 std4 = new Score3();
		
		std1.print();
		std2.print();
		std3.print();
		std4.print();
	}//ene main
}//end class
