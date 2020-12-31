package arrayEx;

public class array05_05 {
//	문제5)
//	100 미만의 양의 정수들이 난수로 주어진다. 
//	정수형 배열 20개에 입력받은 후,
//	입력받은 난수가 각각 몇개인지 출력해야 한다.
//	이때, 작은 수부터 몇개가 겹치는지 출력해야 한다.
//	단, 카운트가 0개인 숫자는 출력하지 않는다.
//
//	1  5개
//	2  6개
//	45  1개
//	67  4개
//	99  1개
public static void main(String[] args) {
		 int []arNum = new int[20];
		 
		 //난수 20개 입력받기
		 for(int i = 0;i<arNum.length;i++) {
			 arNum[i] = (int)(Math.random()*10) + 1;
		 }//end for(i)
		 System.out.print("난수 : ");
		 for(int i = 0;i<arNum.length;i++) {
			 System.out.print(arNum[i]+" ");
		 }
		 System.out.println();
		 //중복되는 난수의 개수 출력
		 for(int i = 0;i<99;i++) {
			 int count = 0;													//반복진행시 count초기화
			 for(int j = 0;j<arNum.length;j++) {
				 if(i == arNum[j])  count++;								//같은값이면 count 1증가
			 }//end for(j)
			 if(count >= 1) System.out.println(i+" : "+ count + "개");		//count가 1이상일 때만 출력
		 }//end for(i);
	}//end main
}//end class
