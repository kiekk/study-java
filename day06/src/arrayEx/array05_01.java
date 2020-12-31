package arrayEx;

import java.util.Scanner;

/*
	문제1)
	100 개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가
	0 이 입력되면 0 을 제외하고 그 때까지 입력된 정수를 출력하되,
	가장 나중에 입력된 정수부터 차례대로 출력하는 프로그램을 작성하시오.
	
	입력 값  10, 9, 8, 4, 80, 40, 0   (0누르면 종료)
	출력 값  40 80 4, 8, 9, 10  	
 */
public class array05_01 {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 int []arNum = new int[100];	//숫자 100개를 저장할 배열
		 int count = 0;					//입력한 숫자의 개수를 저장할 변수
		 
		 //입력
		 System.out.println("숫자를 입력해주세요. 0을 누르면 입력이 종료됩니다.");
		 for(int i = 0;i<100;i++) {
			 System.out.print("숫자 입력 : "); arNum[i] = sc.nextInt();
			 if(arNum[i] == 0) 	{								//입력값이 0이면 반복 종료
				 System.out.println("입력을 종료합니다.");
				 break;
			 }else				 								//0이 아니면 count를 1증가하고 반복 진행
				 count++;
		 }//end for
		 
		 //출력
		 System.out.println("입력한 숫자를 역순으로 출력합니다. ");		//count값 이용
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}//end try
		 System.out.print("입력한 숫자 :");		 
		 for(int i = count-1; i >= 0;i--) {			//0은 제외해야 하기 때문에 count-1부터 시작합니다.
			 System.out.print(" " + arNum[i]);
			 try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}//end try
		 }//end for
	}//end main
}//end class
