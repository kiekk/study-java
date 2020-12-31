package day01;

import java.util.Scanner;
/*
 	
 */
public class ScanTest02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//이름
		//주소 (2개 단어)
		//키 소수점 한자리
		//★엔터값 처리하기   -> scan.nextln();
		String name = "";
		String address = "";
		double height = 0.0;
		char gender = ' ';
		
		//문자열이 아닌 타입을 입력받고 문자열로 만들기
		//scan.nextDouble()+"";		//간단하게 입력받은 double형 값을 문자열로 형변환 할 수 있습니다.
		//입력
		System.out.print("이름 : "); name = scan.nextLine();
		System.out.print("주소 : "); address = scan.nextLine();
		System.out.println("성별 : "); gender = scan.next().charAt(0);
		System.out.print("키 : "); height = scan.nextDouble();
		//출력
		System.out.println("**** 출력 ****");
		System.out.println("이름 : " + name);
		System.out.println("주소 : " + address);
		System.out.println("성별 : " + gender);		
		System.out.println("키 : " + height + "cm");
	}
}
