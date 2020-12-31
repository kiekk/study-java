package team_homework;

public class Print_star {
	/**
	 * ���� Ǯ�� : ����ȣ
	 * 	3�� 5���� *�� ����ϴ� �޼ҵ��Դϴ�.
	 */
	static void printSquare() {
		for(int i = 0;i<3;i++) {		//��
			for(int j = 0;j<5;j++) {	//��
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printSquare
	/**
	 * ���� Ǯ��: ����ȣ
	 * ���̰� n�� ���� �ﰢ���� *�� ���� ����� �޼ҵ��Դϴ�.
	 */
	static void printTriangle_v1() {
		int input = 0;
		for(int i = 0;i<input;i++) {		//��
			for(int j = 0;j<=i;j++) {	//��
				System.out.print("*");
			}//end for(j)
			System.out.println();
		}//end for(i)
	}//end printTriangle_v1
	/**
	 * ���̰� 5�� ���� �ﰢ���� *�� ���� ����� �޼ҵ��Դϴ�.
	 * ���������� �����ϴ�.
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
	 * ���̰� 5�� ���� �ﰢ���� *�� ���� ����� �޼ҵ��Դϴ�.
	 * �ϴ����� ��µǰ� �����ϴ�.
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
	 * ���̰� 5�� ���� �ﰢ���� *�� ���� ����� �޼ҵ��Դϴ�.
	 * �ϴ�,�׸��� ���������� ��µǰ� �����ϴ�.
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
	 * �Ƕ�̵� ����� *�� ���� ����� �޼ҵ��Դϴ�.
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
