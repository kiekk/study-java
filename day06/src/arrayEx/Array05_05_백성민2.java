package arrayEx;

import java.util.Random;

public class Array05_05_백성민2 {

	public static void main(String[] args) {
		int cnt = 0;
		int sum = 0;
		int[] arNum = new int[20];
		Random r = new Random();

		//30미만의 난수 20개 저장
		for (int i = 0; i < arNum.length; i++) {
			arNum[i] = r.nextInt(30);
		}//end for(i)
		//20개의 난수 오름차순 정렬
		for (int i = 0; i < arNum.length; i++) {
			for (int j = i + 1; j < arNum.length; j++) {
				if (arNum[i] > arNum[j]) {
					int temp = arNum[i];
					arNum[i] = arNum[j];
					arNum[j] = temp;
				}//end if
			}//end for(j)
		}//end for(i)
		
		int[] tempCnt = new int[20];

		for (int i = 0; i < arNum.length; i++) {
			for (int j = 0; j < arNum.length; j++) {
				if (arNum[i] == arNum[j]) {
					tempCnt[i] = ++cnt;
				}//end if
			}//end for(j)
			cnt = 0; 			//cnt 초기화
		} // i for
		//난수 확인
		for (int i = 0; i < arNum.length; i++) {
			System.out.print(arNum[i] + " ");
		}//end for(i)
		System.out.println();		//줄바꿈
			
		//1번방법			i와 i의 앞의 값만 비교
		//난수 출력
//		for (int i = 1; i < arNum.length; i++) {
//			for(int j = i-1;j < i;j++) {
//				if(arNum[i] != arNum[j]) {
//					System.out.println(arNum[j] + " : " + tempCnt[j] + "개");
//				}//i, j가 같지 않을 경우 j를 출력
//				if(i == (arNum.length-1)){
//					System.out.println(arNum[i] + " : " + tempCnt[i] + "개");
//				}//i가 마지막 번호인 경우 출력
//			}//end for(j)
//		}//end for(i)
		
		//2번방법		i와 i의 뒤의 값만 비교
		for (int i = 0; i < arNum.length-1; i++) {
			for(int j = i+1;j > i ;j--) {
				if(arNum[i] != arNum[j]) {
					System.out.println(arNum[i] + " : " + tempCnt[i] + "개");
				}//i, j가 같지 않을 경우 j를 출력
				if(j == (arNum.length-1)){
					System.out.println(arNum[j] + " : " + tempCnt[j] + "개");
				}//j가 마지막 번호인 경우 출력
			}//end for(j)
		}//end for(i)
	}//end main
}//end class
