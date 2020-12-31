package day01;
// c에서는 #include ~~ -> java에서는 import를 사용합니다.
/**
	클래스 메서드를 설명할 때 스는 주석(HTML용으로 보여주기 위한 주석입니다.)
 */
/*
 	ctrl + f11로 실행합니다.
 */
//public : 수정자(modifier)	- 명령, 지시, 상태 등을 표시합니다. 키워드
//			'오픈 되어 있다'라는 뜻입니다. 다른 소스 파일 등에서 언제든지 가져와 사용할 수 있습니다.
//class : '여기서 부터는 클래스 영역이다'라는 뜻입니다.
// class 클래스명 : 클래스 명은 반드시 대문자로 시작해야 합니다. 클래스는 문장의 품사 중 '주어'에 해당합니다.
//class -> Test01, String[], System... 총 3개입니다.
// {		클래스 바디 영역
//	변수
//	메서드(=함수)	메서드는 무조건 클래스 내부에 존재해야 합니다.
//  메서드 -> main(), println() 총 2개입니다.
// }
public class Test01 {
	//static : '이 소스를 실행하기 전에 미리 메모리에 띄워 둘 것'
	//			static 클래스의 ~~~
	//static 메서드		클래스를 이용해서 사용하는 메서드
	//static 변수		클래스를 이용해서 사용하는 변수
	public static void main(String[] args) {
		//System : 클래스, 자바환경에서..
		//out : 객체, (멤버변수)
		//println() : 출력용 메서드
		System.out.println("자바 처음 설치");
		//static으로 만들어지면 이탤릭체로 구분됩니다.
	}

}
