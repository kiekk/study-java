package classEx;
/*
 	클래스 만들기
 	5명의 학생이 있습니다.
 	이 학생들은 3과목 시험을 봅니다.
 	데이터를 구조화 하기 위해 클래스로 만들어 봅니다.
 */
class StdScore{
	String name;
	int kor;
	int eng;
	int math;
	
	void printStdScore() {
		System.out.printf("이름 : %s\t",this.name);		//this는 생략 가능
		System.out.printf("국어 : %d점\t",this.kor);
		System.out.printf("영어 : %d점\t",this.eng);
		System.out.printf("수학 : %d점\n",this.math);
	}//end printStdScore
}//end StdScore
public class ClassTest01 {

	public static void main(String[] args) {
		//1번 홍길동 10 20 30,
		//2번 박문수 11 21 31,
		//3번 이순신 12 22 32,
		StdScore hgd = new StdScore();			//홍길동 객체 생성
		hgd.name = "홍길동";					//홍길동 정보 입력
		hgd.kor = 10;
		hgd.eng = 20;
		hgd.math = 30;
		StdScore pms = new StdScore();			//박문수 객체 생성
		pms.name = "박문수";					//박문수 정보 입력
		pms.kor = 11;
		pms.eng = 21;
		pms.math = 31;
		StdScore iss = new StdScore();			//이순신 객체 생성
		iss.name = "이순신";					//이순신 정보 입력
		iss.kor = 12;
		iss.eng = 22;
		iss.math = 32;
		hgd.printStdScore();					//홍길동 정보 출력
		pms.printStdScore();					//박문수 정보 출력
		iss.printStdScore();					//이순신 정보 출력
		
	}//end main
}//end class
