package team_homework;

public class Print_star {
	/**
	 * 문제 풀이 : 윤순호
	 * 	3행 5열로 *을 출력하는 메소드입니다.
	 */
	static void printSquare() {
		for(int i = 0;i<3;i++) {		//행
			for(int j = 0;j<5;j++) {	//열
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printSquare
	/**
	 * 문제 풀이: 윤순호
	 * 높이가 n인 직각 삼각형을 *을 통해 만드는 메소드입니다.
	 */
	static void printTriangle_v1() {
		int input = 0;
		for(int i = 0;i<input;i++) {		//행
			for(int j = 0;j<=i;j++) {	//열
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printTriangle_v1
	/**
	 * 높이가 5인 직각 삼각형을 *을 통해 만드는 메소드입니다.
	 * 역방향으로 만들어봅니다.
	 */
	static void printReverseTriangle_v1() {
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5-i;j++) {
				System.out.print(" ");
			}//end for(j)
			for(int k=0;k<=i;k++) {
				System.out.print("*");
			}//end for(k)
			System.out.println();
		}//end for(i)
	}//end printReverseTriangle_v1
	/**
	 * 높이가 5인 직각 삼각형을 *을 통해 만드는 메소드입니다.
	 * 하단으로 출력되게 만들어봅니다.
	 */
	static void printTriangle_v2() {
		for(int i =0;i<5;i++) {
			for(int j = 0;j<5-i;j++) {
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printTriangle_v2
	/**
	 * 높이가 5인 직각 삼각형을 *을 통해 만드는 메소드입니다.
	 * 하단,그리고 역방향으로 출력되게 만들어봅니다.
	 */
	static void printReverseTriangle_v2() {
		for(int i = 0;i<5;i++) {
			for(int j = 0;j < i;j++) {
				System.out.print(" ");
			}//end for(j)
			for(int k = 0;k<5-i;k++) {
				System.out.print("*");
			}//end for(k)
			System.out.println();
		}//end for(i)
	}//end printReverseTriangle_v2
	/**
	 * 피라미드 모양을 *을 통해 만드는 메소드입니다.
	 */
	static void printPyramid() {
		for(int i = 0;i<5;i++) {
			for(int j = 0;j<5-i;j++) {
				System.out.print(" ");
			}//end for(j)
			for(int k = 0;k < (2*i) + 1;k++) {
				System.out.print("*");
			}//end for(k)
			System.out.println();
		}//end for(i)
	}//end printPyramid
	public static void main(String[] args) {
//		Print_star.printSquare();
		Print_star.printTriangle_v1();
//		Print_star.printReverseTriangle_v1();
//		Print_star.printTriangle_v2();
//		Print_star.printReverseTriangle_v2();
//		Print_star.printPyramid();
//		for(int i = 0;i<5;i++) {
//			for(int j = 0;j < i;j++) {
//				System.out.print(" ");
//			}
//			for(int k = 0;k<5-(2*i);k++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}
	}

}
