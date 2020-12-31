package testEx;

import java.util.Scanner;

public class Test02_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제2)
		// 단수와 행수를 입력받아 출력해 주세요
		// 예) 시작 단수 : 21 (단수)
		// 끝행 : 10(행)
		//출력)21단
		//	21 * 1 = 21,	21*2 = 42,	21*3 = 63
		//	21 * 4 = 21,	21*5 = 42,	21*6 = 63
		//	21 * 7 = 21,	21*8 = 42,	21*9 = 63
		//	21 * 10 = 210;
		
		//시작단수는 최소 2부터 시작해야 합니다.
		//행수는 최소 2행이상이어야 합니다.
		//출력은 3행 3열 단위로 출력합니다.
		System.out.println("몇 단을 출력하시겠습니까?");
		int startDan = sc.nextInt();
		System.out.println("몇 행까지 출력하시겠습니까?");
		int num = sc.nextInt();
		int count = 0;
		for(int i = 0;i < num;i++) {
			for(int j = 0;j < 3;j++) {
				System.out.printf("%d *%2d = %3d    ",startDan,++count,startDan*count);
			}
			System.out.println("");
		}
		
		
	}

}
