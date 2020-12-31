package foreachEx;
/*
 	빠른 for문(foreach문) - 컬렉션에서만 사용 가능합니다.
 	
 */
public class ForEachTest2 {

	public static void main(String[] args) {
		int[][] arScore = {
				{10, 20, 30, 40},	//1번
				{50, 60, 70, 80},	//2번
				{51, 61, 71, 71},	//3번
		};
		//번호, 각 점수, 총점
		int i = 0,sum = 0;
		System.out.println("번호\t국어\t수학\t영어\t과학\t총점");
		for(int[] a : arScore) {	
			System.out.print((++i)+"번");
			for(int b : a) {		
				System.out.print("\t"+b+"점 ");
				sum += b;
			}//for int
			System.out.println("\t"+sum+"점");
			sum = 0;
		}//for int[]
		//2차원 배열의 부분요소는 1차원 배열
		//1차원 배열의 부분요소는 int입니다.
		//따라서 for문을 2번 사용하여 int요소에 접근해야 합니다.
	}

}
