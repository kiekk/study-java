package arrayEx;
/*
	문제2)
	10개의 정수를 난수로 입력받아 배열에 저장한 후 
	짝수 번째 입력된 값의 합과 홀수 번째 입력된 값의 평균을 
	출력하는 프로그램을 작성하시오. 
	평균은 반올림하여 소수첫째자리까지 출력한다.
	
	String.format(서식문자, 값)
	
	저장된 값   99, 45, 34, 67, ...  10개입력
	짝수 인덱스 값  0, 2, 4, 6, 8번째 값
	(99+34+...n)  갯수 = 56.789  56.7
	홀수 인덱스 값  1, 3, 5, 7, 9
	(45+67+...)  갯수 = 5.6777   5.6 	
 */
public class array05_02 {
	public static void main(String[] args) {
		int []arNum = new int[10];
		
		//10개의 중복되지 않는 난수 입력
		for(int i = 0;i<arNum.length;i++) {
			arNum[i] = (int) ((Math.random()*99) +1);
			for(int j = 0;j<i;j++) {
				if(arNum[i] == arNum[j]) {
					i--;
					break;
				}
			}//end for(j)
		}//end for(i)
		
		//생성된 10개의 난수 값 출력
		System.out.print("생성된 10개의 난수 값 :");
		for(int i = 0;i<arNum.length;i++) {
			System.out.print(" "+arNum[i]);
		}
		System.out.println(); System.out.println();				//줄바꿈
		
		//짝수 인덱스 값 저장, 출력
		int sum_Even = 0,sum_Odd = 0,cnt_Even = 0,cnt_Odd = 0;
		System.out.print("짝수 인덱스의 값      :");
		for(int i = 0;i<arNum.length;i++) {
			if(i % 2 == 0) {
				sum_Even += arNum[i];
				cnt_Even++;
				System.out.print(" "+arNum[i]+"   ");
			}//end if
		}//end for(i)
		//홀수 인덱스 값 저장, 출력
		System.out.println();									//줄바꿈
		System.out.print("홀수 인덱스의 값      :");
		for(int i = 0;i<arNum.length;i++) {
			if(i % 2 == 1) {
				sum_Odd += arNum[i];
				cnt_Odd++;
				System.out.print("    " + arNum[i]);
			}//end if
		}//end for(i)
		System.out.println(); System.out.println();				//줄바꿈
		double avg_Even = (double)sum_Even/cnt_Even;			//짝수 인덱스의 평균
		double avg_Odd = (double)sum_Odd/cnt_Odd;				//홀수 인덱스의 평균
		
		//String.format을 사용해보자, printf와 비슷
		String msg_Even = String.format("짝수 인덱스의 개수 : %d개, 평균 : %.1f", cnt_Even, avg_Even );
		System.out.println(msg_Even);			
		String msg_Odd = String.format("홀수 인덱스의 개수 : %d개, 평균 : %.1f", cnt_Odd, avg_Odd );
		System.out.println(msg_Odd);
//		System.out.println("짝수 인덱스의 평균 : "+avg_Even);		//기존의 방법
//		System.out.println("홀수 인덱스의 평균 : "+avg_Odd);
	}//end main
}//end class
