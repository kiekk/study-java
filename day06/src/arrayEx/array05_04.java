package arrayEx;

public class array05_04 {
//	문제4)
//	10개 정수형 배열에서 세 자리 이하의 정수를 난수로 입력 받은 후 
//	그 때까지 입력된 최대값과 최소값을 출력하는 프로그램을 작성하시오.
//	난수  100, 200, 300 ...  20개 입력 완료됐습니다!
//	최대값  756입니다.
//	최소값  121 입니다.

public static void main(String[] args) {
		int []arNum = new int[10];
		//난수 입력
		System.out.print("입력된 난수 :");
		for(int i = 0;i<arNum.length;i++) {
			arNum[i] = (int)((Math.random()*999) + 1);
			for(int j = 0;j<i;j++) {
				if(arNum[i] == arNum[j]) i--;
			}//end for(j)
			System.out.print(" "+arNum[i]);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}//end try
		}//end for(i)
		System.out.println();							//줄바꿈
		
		//최대값, 최소값 구하기
		int max = 0, min = 0;
		max = arNum[0];
		min = arNum[0];
		for(int i = 1;i<arNum.length;i++) {
			if(max < arNum[i]) max = arNum[i];			//max값 저장
			if(min > arNum[i]) min = arNum[i];			//min값 저장
		}//end for(i)
		//최대값, 최소값 출력
		String msg_Max = String.format("최대값은 : %d입니다.", max);
		String msg_Min = String.format("최소값은 : %d입니다.", min);
		System.out.println(msg_Max);
		System.out.println(msg_Min);		
	}//end main
}//end class
