package classEx;

import java.util.Scanner;
class StdScore2{
	static Scanner sc = new Scanner(System.in);
	String name;
	private int kor;
	private int eng;
	private int math;

	public void setKor(int kor) {											
		this.kor = kor;
	}//end setKor							
	public void setEng(int eng) {			
		this.eng = eng;
	}//end setEng													
	public void setMath(int math) {	
		this.math = math;
	}//end setMath
	void printStdScore() {
		System.out.printf("이름 : %s\t",this.name);		//this는 생략 가능
		System.out.printf("국어 : %d점\t",this.kor);
		System.out.printf("영어 : %d점\t",this.eng);
		System.out.printf("수학 : %d점\n",this.math);
	}//end printStdScore
}//end StdScore
public class ClassTest02 {
	static Scanner sc = new Scanner(System.in);
	//학생 정보 입력
	static void inputStdScore(StdScore2 std) {
		int kor = 0,eng = 0,math = 0;
		String []subName = {"국어","영어","수학"};
			System.out.print("이름을 입력하세요 : "); std.name = sc.next();
			while(true){
				System.out.print(subName[0]+"점수를 입력하세요 : "); kor = sc.nextInt(); 
				if(kor >= 0 && kor <= 100) {
					std.setKor(kor);
					break;
				}
				System.out.println("0~100 사이로 입력해주세요.");
			}//end while
			while(true){
				System.out.print(subName[1]+"점수를 입력하세요 : "); eng = sc.nextInt(); 
				if(eng >= 0 && eng <= 100) {
					std.setEng(eng);
					break;
				}
				System.out.println("0~100 사이로 입력해주세요.");
			}//end while
			while(true){
				System.out.print(subName[2]+"점수를 입력하세요 : "); math = sc.nextInt(); 
				if(math >= 0 && math <= 100) {
					std.setMath(math);
					break;
				}
				System.out.println("0~100 사이로 입력해주세요.");
			}//end while
	}//end inputStdScore
	public static void main(String[] args) {
		StdScore2 std = new StdScore2();
		System.out.println("---학생 정보 입력 프로그램---");
		inputStdScore(std);
		std.printStdScore();
	}//end main
}//end class
