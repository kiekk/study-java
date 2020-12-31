package classEx2;

import java.util.Scanner;

/*
 	클래스{
 		필드 : 인스턴스 변수 (private)외부에 노출시키지 않도록 합니다.
 				getter / setter, 생성자 등으로 입력값을 넣어서 관리합니다.
 		메서드
 			-생성자 : 인스턴스 만들 때, 초기값을 넣을 수 있습니다.
 				리턴타입이 없습니다. 클래스명과 동일합니다.
 				보편적으로 접근지정자 public을 사용합니다.
 				1) 기본 생성자
 					-컴파일러가 자동으로 만들어 줍니다. 단, 다른 생성자가 없는 경우에만 만들어 줍니다.
 				2) 인수 있는 생성자
 					-필드에 따라 여러개의 생성자를 만들 수 있습니다.(오버로딩) 
 			-setter / getter
 				1) 값 수정할 때 필요합니다.
 				2) 생서자가 없는 경우도 있기 때문에 setter을 이용해서 값 입력이 가능합니다.
 			-일반 비즈니스 메서드
 				1) 클래스의 기능을 담당합니다.
 				2) 필요에 따라 public, private을 적절히 사용합니다.
 	}
 	데이터 모델링
	1) 생년월일 관리 클래스 만들기
	2) 사람 클래스 구성
	3) 통장 만들기 클래스

 */
class BirthYAD{
	String name;
	private int year;
	private int month;
	private int day;
	//getter / setter
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	public int getYear() {return year;}
	public void setYear(int year) {this.year = year;}
	public int getMonth() {return month;}
	public void setMonth(int month) {this.month = month;}
	public int getDay() {return day;}
	public void setDay(int day) {this.day = day;}
	//생성자
	public BirthYAD(String name,int year,int month,int day) {
		this.name = name;
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public BirthYAD(String name,int year,int month) {
		this.name = name;
		this.year = year;
		this.month = month;
	}
	public BirthYAD(String name,int year) {
		this.name = name;
		this.year = year;
	}
	public BirthYAD(String name) {
		this.name = name;
	}
	public BirthYAD(int year) {
		this.year = year;
	}
	public BirthYAD(int month,int day) {
		this.month = month;
		this.day = day;
	}
	void printBirthYAD() {
		System.out.println(name+"\t"+year+"\t"+month+"\t"+day);
	}
}//end BirthYAD
public class ClassTest06_1 {
	static Scanner sc = new Scanner(System.in);
	//출력하기
	static void printObj(BirthYAD []obj) {
		System.out.println("이름\t년도\t월\t일");
		for(int i = 0;i<obj.length;i++) {
			obj[i].printBirthYAD();
		}//end for(i)
	}//end printObj
	//변경하기
	static void changeObj(BirthYAD []obj) {
		int inputNum = 0,changeYear = 0,changeMonth = 0,changeDay = 0;
		System.out.println("누구의 데이터를 변경하시겠습니까?"); inputNum = sc.nextInt();
		System.out.println(obj[inputNum-1].name+"의 데이터를 변경합니다.");
		while(true) {
			System.out.print("Year를 입력해주세요 : "); changeYear = sc.nextInt(); 
			if(changeYear >= 1900 && changeYear <= 2020) {
				obj[inputNum-1].setYear(changeYear);
				break;
			}else {
				System.out.println("년도는 1900~2020년 사이로 입력해주세요.");
			}//end if
		}//end while
		while(true) {
			System.out.print("Month를 입력해주세요 : ");changeMonth = sc.nextInt(); 
			if(changeMonth >= 1 && changeMonth <= 12) {
				obj[inputNum-1].setMonth(changeMonth);
				break;
			}else {
				System.out.println("월은 1~12월 사이로 입력해주세요.");
			}//endif
		}//end while
		while(true) {
			System.out.print("Day를 입력해주세요 : ");changeDay = sc.nextInt(); 
			if(changeDay >= 1 && changeDay <= 30) {
				obj[inputNum-1].setDay(changeDay);
				break;
			}else {
				System.out.println("일은 1~30일 사이로 입력해주세요.");
			}//endif
		}//end while
	}//end changeObj
	static int showMenu(int select) {
		System.out.println("---메뉴 보기---");
		System.out.println("1. 출력");
		System.out.println("2. 수정");
		System.out.println("0. 종료");
		System.out.print("입력 : "); select = sc.nextInt();
		return select;
	}//end showMenu
	public static void main(String[] args) {
		BirthYAD[] obj = new BirthYAD[3];
		int select = -1;
		obj[0] = new BirthYAD("홍길동",1945,5,2);
		obj[1] = new BirthYAD("박문수",1995);
		obj[2]= new BirthYAD("이순신");
		printObj(obj);		//초기값 출력
		while(select != 0) {
			select = showMenu(select);
			if(select == 0)break;		//0일 때 종료
			switch(select){
			case 1: printObj(obj); break;
			case 2: changeObj(obj); break;
			}//end switch
		}//end while
		System.out.println("종료합니다.");
	}//end main
}//end class
