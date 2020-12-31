package arrayEx;

import java.util.Scanner;

public class array05_03 {
//	문제3)
//	본인의 이름으로 초기화 된 문자배열을 만든다!
//	예) honggildong = {'h' 'o' 'n' 'g' ....  'd', 'o', 'n', 'g'} 으로 초기화
//	문자 한 개를 입력받아 배열에서의 위치를 출력하는 프로그램을 작성하시오.
//	첫 번째 위치는 0번이며 배열에 없는 문자가 입력되면 none 라는 
//	메시지를 출력하고 끝내야 합니다.
//	찾는 문자  o
//	글자 위치  2번째, 9번째
public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char []Myname = {'y','o','o','n','s','o','o','n','h','o'};
		char inputAlpha = ' ';
		int count = 0;
		System.out.print("찾을 문자를 입력하세요 : "); inputAlpha = sc.next().charAt(0);
		System.out.println("찾을 문자 : " + inputAlpha);
		for(int i = 0;i<Myname.length;i++) {
			if(inputAlpha == Myname[i]) {
				System.out.print((i+1)+"번째 ");
			}else {
				count++;
			}
		}//end for(i)
		if(count == Myname.length) System.out.println("NONE");
	}//end main
}//end class
