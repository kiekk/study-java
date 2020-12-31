package testEx;

import java.util.Scanner;

public class Test02_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//문제3) 도형 출력
		// 3-1) 직사각형
		// 높이와 너비를 입력받은 후, 
		// 1부터 해당 면적만큼 출력합니다.
		// 높이 : 4
		// 너비 : 3
		// 1 2 3
		// 4 5 6
		// 7 8 9 
		// 10 11 12
		System.out.println("높이를 입력해주세요.");
		int height = sc.nextInt();
		System.out.println("너비를 입력해주세요.");
		int width = sc.nextInt();
		int count = 0;
		
		for(int i= 0;i< height;i++) {
			for(int j = 0;j< width;j++) {
				System.out.printf("%2d  ",++count);
			}
			System.out.println("");
		}
	}

}
