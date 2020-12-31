package study01;

import java.util.Scanner;

public class MethodTest {
	//5개의 정수를 입력받고 최대값과 최소값 구해주는 void형 메소드(리턴은 사용하지 않습니다)
	int max = 0,min = 0;
	//전역변수 선언은 메모리 낭비, 최대한 전역변수 선언없이 가능하게 끔 변형하자
	void maxmin(int[] arNum) {
		max = arNum[0];
		min = arNum[0];
		for(int i = 1;i<5;i++) {
			if(max < arNum[i]) {
				max = arNum[i];
			}
			if (min > arNum[i]) {
				min = arNum[i];
			}
		}
	}
	void maxmin2(int[] arNum,int[] result) {
		result[0] = arNum[0];
		result[1] = arNum[0];
		for(int i = 1;i<5;i++) {
			if(result[0] < arNum[i]) {
				result[0] = arNum[i];
			}
			if (result[1] > arNum[i]) {
				result[1] = arNum[i];
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MethodTest m = new MethodTest();
		//정수 5개를 입력받을 배열
		int[] arNum = new int[5];
		//최대값,최소값을 입력받을 배열
		int[] result = new int[2];

		//정수 5개 입력받기
		for(int i = 0;i<arNum.length;i++) {
			System.out.print((i+1)+"번째 정수 입력 : ");
			arNum[i] = sc.nextInt();
		}
		
//		m.maxmin(arNum);
//		System.out.println("최대값 : "+m.max);
//		System.out.println("최소값 : "+m.min);
		
		m.maxmin2(arNum,result);
		System.out.println("최대값 : "+result[0]);
		System.out.println("최소값 : "+result[1]);
		
		
	}
}
