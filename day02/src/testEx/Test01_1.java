package testEx;

import java.util.Scanner;

public class Test01_1 {

	public static void main(String[] args) {
		//문1) 두 정수를 입력받고, 두 정수의 누적값 출력 (c언어 출제 문제)
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		System.out.println("첫 번째 값 : "+num1+"\n두 번째 값 : " + num2+"\n두 수의 합 : "+ (num1+num2));
	}

}
