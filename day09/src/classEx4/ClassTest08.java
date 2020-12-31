package classEx4;

class Score2{
	String name;
	int bun=0;
	static int cnt = 0;
	int kor;
	int eng;
	int math;
	public void print() {
		System.out.println(bun+"번 : "+name+" // "+kor+" // "+eng+" // "+math +"점");
	}
	
	{	//인스턴스 초기화 블럭
		//인스턴스가 만들어질 때 마다 이 블럭을 실행합니다.
		System.out.println("인스턴스 초기화 블럭");
		bun = ++cnt;
		
		name = "미정";
		kor = -1;
		eng = -1;
		math = -1;
		//모든 인스턴스들이 처음에 값을 넣고자 할 때 쓰면 편합니다.
		//인스턴스를 실행할 때, 어떤 일을 공통적으로 시키고자 할 때 사용합니다.
	}
}

public class ClassTest08 {

	public static void main(String[] args) {
		Score2 std1 = new Score2();
		Score2 std2 = new Score2();
		Score2 std3 = new Score2();
		Score2 std4 = new Score2();
		
		std1.print();
		std2.print();
		std3.print();
		std4.print();
	}//ene main
}//end class
