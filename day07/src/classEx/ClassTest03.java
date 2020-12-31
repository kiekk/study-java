package classEx;

import java.util.Scanner;

class StdScore3{
	static Scanner sc = new Scanner(System.in);
	private static int flag;
	String name;
	private int kor;
	private int eng;
	private int math;
	//kor, eng, math  set메소드
	public void setKor(int kor) {											
		this.kor = kor;
	}//end setKor								
	public void setEng(int eng) {			
		this.eng = eng;
	}//end setEng													
	public void setMath(int math) {	
		this.math = math;	
	}//end setMath
	//kor, eng, math get메소드
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	//학생 정보 출력
	void printStdScore() {
		System.out.println("┏━━━━━━━━━━━━━━━━━━━━┓");
		System.out.printf("┃    이름 : %2s               \n",this.name);		//this는 생략 가능
		System.out.printf("┃    국어 : %2d점                 ┃\n",this.getKor());
		System.out.printf("┃    영어 : %2d점                 ┃\n",this.getEng());
		System.out.printf("┃    수학 : %2d점                 ┃\n",this.getMath());
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━┛");
	}//end printStdScore
}//end StdScore
public class ClassTest03 {
	static Scanner sc = new Scanner(System.in);
	static StdScore3[] NULL;
	static int flag;//학생 입력 유무 파악할 플래그 변수
	//메인 메뉴 보여주기
	static int showMenu(int selectNum) {
		System.out.println("┏━━━━━━━메뉴    보기  ━━━━━━━┓");
		System.out.println("┃   1. 학생 정보 입력하기          ┃");
		System.out.println("┃   2. 학생 정보 출력하기          ┃");
		System.out.println("┃   3. 학생 정보 다시입력          ┃");
		System.out.println("┃   0. 종료 하기                       ┃");
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━┛");
		System.out.print("   입력 : "); selectNum = sc.nextInt();
		return selectNum;
	}
	//학생 정보 입력
	static void inputStdScore(StdScore3 []arStdNum) {
		String name = "";
		int kor = 0,eng = 0,math = 0;
		String []subName = {"국어","영어","수학"};
		if(flag == 1) {
			System.out.println("이미 입력하셨습니다.");
		}else {
			System.out.println("┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓");
			System.out.println("     "+arStdNum.length + "명의 학생의 정보를 입력합니다.");
			System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
			for(int i = 0;i<arStdNum.length;i++) {
				arStdNum[i] = new StdScore3();
				System.out.print((i+1)+"번 학생의 이름을 입력하세요 : "); arStdNum[i].name = sc.next();
				while(true){
					System.out.print(subName[0]+"점수를 입력하세요 : "); kor = sc.nextInt(); 
					if(kor >= 0 && kor <= 100) {
						arStdNum[i].setKor(kor);
						break;
					}
					System.out.println("0~100 사이로 입력해주세요.");
				}//end while
				while(true){
					System.out.print(subName[1]+"점수를 입력하세요 : "); eng = sc.nextInt(); 
					if(eng >= 0 && eng <= 100) {
						arStdNum[i].setEng(eng);
						break;
					}
					System.out.println("0~100 사이로 입력해주세요.");
				}//end while
				while(true){
					System.out.print(subName[2]+"점수를 입력하세요 : "); math = sc.nextInt(); 
					if(math >= 0 && math <= 100) {
						arStdNum[i].setMath(math);
						break;
					}
					System.out.println("0~100 사이로 입력해주세요.");
				}//end while
			}//end for(i)
			flag = 1;							//flag 변수로 학생정보 입력의 유무 파악
			System.out.println("┏━━━━━━━━━━━━━━━━┓");
			System.out.println("              입력 완료");
			System.out.println("┗━━━━━━━━━━━━━━━━┛");
		}//end if
	}//end inputStdScore
	static void showStdScore(StdScore3 []arStdNum) {
		if(flag != 1) {
			System.out.println("학생 정보를 먼저 입력하세요.");
		}else {
			for(int i = 0;i<arStdNum.length;i++) {
				arStdNum[i].printStdScore();
			}//end for
		}//end if
	}//end showStdScore
	static StdScore3[] createStdNum() {
		int stdNum = 0;
		System.out.println("┏━━━━━━━ 학생 정보 입력 프로그램 ━━━━━━━┓");
		System.out.print("    몇 명의 학생의 정보를 입력하시겠습니까? "); stdNum = sc.nextInt();
		System.out.println("┗━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛");
		StdScore3 []arStdNum = new StdScore3[stdNum];
		flag = 0;
		return arStdNum;
	}//end createStdNum
	public static void main(String[] args) {
		int selectNum = 0;
		StdScore3 []arStdNum = NULL;
		arStdNum = createStdNum();
		breakOut :
			for(;;) {
				selectNum = showMenu(selectNum);
				if (selectNum == 0) break breakOut;
				switch(selectNum) {
				case 1: inputStdScore(arStdNum);break;
				case 2: showStdScore(arStdNum); break;
				case 3: main(args);break;
				}//end switch
			}//end for
		System.out.println("프로그램을 종료합니다.");
	}//end main
}//end class
