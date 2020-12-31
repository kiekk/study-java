package testEx;

import java.util.Scanner;

public class Test02_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제1)
		// 구구단 출력
		// 단수를 입력받은 후, 해당 단수의 구구단을 출력해 보세요
		// 예) 3
		// 출력) 3단
		// 3 * 1 = 3,	3 * 2 = 6,	3 * 3 = 9
		// 3 * 4 = 12,	3 * 5 = 15,	3 * 6 = 18
		// 3 * 7 = 21,	3 * 8 = 24,	3 * 9 = 27
		
		//3열 단위로 출력해 주세요
		int num = sc.nextInt();
		int count = 0;
		for(int i = 0;i < 3;i++) {
			for(int j = 0;j < 3;j++) {
				System.out.printf("%d *%2d = %2d    ",num,++count,num*count);
			}
			System.out.println("");
		}
	}
}
