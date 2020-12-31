package arrayEx;
public class Array03 {

	public static void main(String[] args) {
		//정수 배열 5개 만들어서
		//1~10까지 난수 5개를 입력해 봅니다.
		//입력한 난수를 출력해 봅니다.
//		int arNum[] = new int[5];						//정수 5개를 입력받을 배열 선언
//		for(int i = 0;i < arNum.length;i++) {			//배열의 길이만큼 반복되게 조건 설정
//			int randNum = (int)(Math.random()*10) +1;	//1~10까지의 난수를 저장할 변수 randNum 선언
//			arNum[i] = randNum;							//arNum[i]에 생성한 난수를 저장
//			System.out.println(arNum[i]);				//저장한 난수를 출력
//		}//end for(i)
		//문제2) 정수배열 6개 만들어서 1~45까지 난수 6개를 넣어봅니다.
		//입력한 난수를 출력해봅니다.
//		int arNum2[] = new int[6];
//		for(int i = 0;i< arNum2.length;i++) {
//			int randNum = (int)(Math.random()*45) +1;
//			arNum2[i] = randNum;
//			System.out.println(arNum2[i]);
//		}
		//문제3) 문제2에서 입력한 난수가 겹치지 않게 6개의 정수를 입력해 봅니다.
		//입력한 난수를 출력해 봅니다.
//		//난수 입력
//		int arNum4[] = new int[6];
//		for(int i = 0;i<arNum4.length;i++) {
//			arNum4[i] = (int)(Math.random()*45) +1;
//			for(int j = 0; j < i;j++) {			//★
//				if(arNum4[i] == arNum4[j])		//★
//					i--;						//★
//			}//end for(j)
//		}//end for(i)
//		for(int i = 0;i< arNum3.length-1;i++) {
//			for(int j = 1;j<i+1;j++) {
//				if(arNum3[i] == arNum3[j]){
//					int randNum = (int)(Math.random()*45) +1;
//					if(arNum3[i] != randNum) { 
//						arNum3[j] = randNum;
//					}
//					else j--;
//				}//end if
//			}//end for(j)
//		}//end for(i)
//		for(int i = 0;i< arNum3.length;i++) {
//			System.out.println("arNum["+i+"] : "+arNum3[i]);
//		}
//		int arNum3[] = new int[6];
//		for(int i = 0;i<arNum3.length;i++) {
//			arNum3[i] = (int)(Math.random()*45) +1;
//			for(int j = 0;j<i;j++) {
//				if(arNum3[i] == arNum3[j])
//					i--;
//			}
//		}
//		for(int i = 0;i<arNum3.length;i++) {
//			System.out.println(arNum3[i]);
//		}
		//문제4) 문제3에서 입력한 난수를 오름차순으로 출력해 봅니다.
//		
		//난수 입력
		int arNum4[] = new int[6];
		for(int i = 0;i<arNum4.length;i++) {
			arNum4[i] = (int)(Math.random()*45) +1;
			for(int j = 0; j < i;j++) {			//★
				if(arNum4[i] == arNum4[j])		//★
					i--;						//★
			}//end for(j)
		}//end for(i)
		//난수 정렬
		for(int i = 0;i < arNum4.length;i++) {
			for(int j = i+1; j < arNum4.length;j++) {
				if(arNum4[i] > arNum4[j]) {
					int temp;
					temp = arNum4[j];
					arNum4[j] = arNum4[i];
					arNum4[i] = temp;
				}//end if
			}//end for(j)
		}//end for(i)
		//난수 출력
		for(int i = 0;i< arNum4.length;i++) {
			System.out.println(arNum4[i]);
		}//end for(i)
		
		
		//문제 4-1) 원본데이터 변경없이 오름차순 정렬해봅니다.
		//임시 배열을 만들어서 데이터를 복사해 복사한 데이터로 정렬해봅니다.
		int []temp = new int[arNum4.length];
	}//end main
}//end class
