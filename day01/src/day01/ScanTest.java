package day01;

import java.util.Scanner;
//import java.util.* -> util안의 모든 것을 사용합니다.
//import java.util.*.* ->util의 하위폴더도 전부 사용합니다.

/*
 	Scanner 클래스
 		키보드 버퍼로부터 데이터를 입력받아
 			변수에 대입하는 클래스 -> 좁은 의미의 Scanner
 		Scanner 입력받고자 하는 입력장치를 인스턴스 만들 때 알려줘야 합니다.
 				System.in <-키보드
 				Scanner sc = new Scanner(System.in);
 				sc라는 객체를 통해서 메소드를 호출할 수 있습니다.
 				변수 = s.메소드(); -> 변수에 데이터를 입력받아 대입할 수 있습니다.
 				
 		Scanner 클래스는 java.util 패키지에 들어있습니다.
 			- scanner를 입력하다 ctrl + space로 자동 완성을 하면
 				소스 상단에 import java.util 이 자동 완성 됩니다. 			
 */
public class ScanTest {

	public static void main(String[] args) {
		//Scanner를 통해서 scan 객체를 하나 만들어 봅니다.
		Scanner scan = new Scanner(System.in);
		//입력장치(키보드)에서 데이터를 입력받습니다.
		// scan.next();   문자열 -> 단어단위(공백기준)로 읽어오기
		// scan.nextLine(); 문자열 -> 문장단위(공백포함)로 읽어오기
		// scan.next0000(); 0000해당 타입으로 읽기
		// scan.nextInt(); 정수값을 읽기
		// scan.nextFloat(); 실수 float값을 읽기
		int korScore = 0;
		int engScore = 0;
		System.out.print("국어 성적 : ");
		korScore = scan.nextInt();				//korScore는 int형이기 때문에 int형으로 데이터를 입력받습니다.
		System.out.print("영어 성적 : ");
		engScore = scan.nextInt();				//engScore는 int형이기 때문에 int형으로 데이터를 입력받습니다.
		System.out.println("국어 성적 : "+ korScore + "점 / 영어 성적 : "+ engScore + "점");
		System.out.println("총점 : "+(korScore+engScore)+"점");
		
		//scan.close();	 안써도 됩니다.
	}

}
