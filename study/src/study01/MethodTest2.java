package study01;

import java.util.Scanner;

public class MethodTest2 {
	//1. 메소드 이름을 조금더 구체적으로 작성
	//ex) evencount -> getEvenCountFrom1
	//ex) sum -> getSumFrom1
	
	//2. 어노테이션으로 메소드를 구체적으로 설명해주기
	//1~n까지 중 짝수의 개수를 구해주는 메소드
	int evenCount(int select) {
		//메인에서 값의 범위를 체크하는 것 보다 메소드에서 체크하는 것이 효율적★
		if(select < 1) {return -1;}
		int count = 0;
		for(int i = 1; i <= select;i++) {
			if(i % 2 == 0) {count++;}
		}
		return count;
	}
	//1~n까지의 합을 구해주는 메소드
	int sum(int select) {
		int result = 0;
		for(int i = 1;i <= select;i++) {
			result += i;
		}
		return result;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest2 m = new MethodTest2();

		int select = 0, count = 0,result = 0;

		while(true) {
			System.out.println("숫자를 입력해주세요\n1보다 큰 수를 입력해주세요");
			select = sc.nextInt();
			if(select < 1) {System.out.println("1보다 큰 수를 입력해주세요");}
			else {break;} 
		}
		//짝수 개수
		count = m.evenCount(select);
		//총 합
		result = m.sum(select);

		System.out.println("1부터 "+select+"까지의 짝수 개수 : "+count);
		System.out.println("1부터 "+select+"까지의 총 합 : "+result);

	}
}
