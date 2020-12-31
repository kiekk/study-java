package testEx;

import java.util.Scanner;

public class Test02_4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		//문제4)
		//은행에서 돈을 인출하고자 합니다.
		//현금 화폐 단위로 최소 화폐 매수를 구합니다.
		//입력예) 15300
		//출력예) 50000원 권 : 0매
		//		  10000원 권 : 1매
		//		   5000원 권 : 1매
		//		   1000원 권 : 0매
		//		    500원 권 : 0매
		//		    100원 권 : 3매
		//최소 입력단위는 백원 단위입니다.
		//최대 입력단위는 육백만원 입니다.
		
		System.out.println("얼마를 인출하시겠습니까?(단위 : 백원)");
		int num = 0,num1 = 0,num2 = 0,num3 = 0,num4 = 0,num5 = 0,num6 = 0;
		int inputCash = sc.nextInt();
		num = inputCash;
		if(num >= 50000) {
			num1 = inputCash / 50000;
			num = inputCash % 50000;
		}
		if(num >= 10000) {
			num2 = num / 10000;
			num = inputCash % 10000;
		}
		if(num >= 5000) {
			num3 = num / 5000;
			num = inputCash % 5000;
		}
		if(num >= 1000) {
			num4 = num /1000;
			num = inputCash % 1000;
		}
		if(num >= 500) {
			num5 = num /500;
			num = inputCash % 500;
		}
		if(num >= 100) {
			num6 = num /100;
			num = inputCash % 100;
		}
		System.out.println(inputCash +"원을 인출합니다.");
		System.out.println("50000원 권 : "+ num1 + "매");
		System.out.println("10000원 권 : "+ num2 + "매");
		System.out.println("5000원 권 : "+ num3 + "매");
		System.out.println("1000원 권 : "+ num4 + "매");
		System.out.println("500원 권 : "+ num5 + "매");
		System.out.println("100원 권 : "+ num6 + "매");
	}
}
